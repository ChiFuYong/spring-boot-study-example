package com.chifuyong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
public class DownloadController {

    @RequestMapping("/download")
    public void download(HttpServletResponse response, HttpServletRequest request) throws IOException {
        //获取当前类的 classpath 根路径 -> file:/home/guan/Documents/ItelliJProjectRootFile/ChiFuYongGitHub/SpringBoot/04_SpringBoot_FileUpLoadDownload/target/classes/
        String classPath = this.getClass().getResource("/").toString();
        System.out.println("classPath = " + classPath);
        //获取当前类的路径 -> /home/guan/Documents/ItelliJProjectRootFile/ChiFuYongGitHub/SpringBoot/04_SpringBoot_FileUpLoadDownload/target/classes/com/chifuyong/controller/
        String classPath2 = this.getClass().getResource("").getPath();
        System.out.println("classPath2 = " + classPath2);
        //获取部署后的真实路径 -> /home/guan/Documents/ItelliJProjectRootFile/ChiFuYongGitHub/SpringBoot/04_SpringBoot_FileUpLoadDownload/src/main/webapp/files
        String realPath = request.getServletContext().getRealPath("files");
        System.out.println("realPath = " + realPath);

        File file = new File(realPath, "Static.png");
        //设置响应信息
        /*
         * 1.访问资源时相应头如果没有设置 Content-Disposition,浏览器默认按照 inline 值进行处理
         *    1.1 inline 能显示就显示,不能显示就下载.
         * 2.只需要修改相应头中 Context-Disposition=”attachment;filename=文件名”
         *    2.1 attachment 下载,以附件形式下载.
         *    2.2 filename=值就是下载时显示的下载文件名
         * */
        response.setHeader("content-type", "application/octet-stream");
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=" + file.getName());

        //实现文件下载
        byte[] buffer = new byte[1024];
        //输入流
        FileInputStream fis = new FileInputStream(file);
        //输出流
        ServletOutputStream os = response.getOutputStream();
        int i = fis.read(buffer);
        while (i != -1){
            os.write(buffer, 0, i);
            i = fis.read(buffer);
        }
        //关闭流
        fis.close();
        os.flush();
        os.close();
    }

}
