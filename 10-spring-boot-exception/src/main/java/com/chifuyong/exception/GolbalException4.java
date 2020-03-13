package com.chifuyong.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @Auther: chify
 * @Date: 17/12/2019 15:35
 * @Description: 全局异常处理2
 */
@Configuration
public class GolbalException4 {

    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new
                SimpleMappingExceptionResolver();
        Properties mappings = new Properties();
        //缺点：无法使用 ModelAndView,添加错误信息
        mappings.put("java.nio.file.FileSystemAlreadyExistsException","/error4/errorFileSystemAlreadyExistsException");
        mappings.put("java.nio.file.FileSystemNotFoundException","/error4/errorFileSystemNotFoundException");
        //设置异常与视图映射信息
        resolver.setExceptionMappings(mappings);
        return resolver;
    }
}
