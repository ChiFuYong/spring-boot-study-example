package com.chifuyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/*
* SpringBoot整合Servlet、Filter、Listener方式一
*/
@SpringBootApplication
@ServletComponentScan //在springBoot启动时会扫描 @WebServlet，并将该类实例化
public class WebApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication1.class,args);
    }

}
