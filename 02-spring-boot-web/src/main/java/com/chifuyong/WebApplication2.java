package com.chifuyong;

import com.chifuyong.filter.SecondFilter;
import com.chifuyong.lister.SecondListener;
import com.chifuyong.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/*
 * SpringBoot整合Servlet、Filter、Listener 方式二
 */
@SpringBootApplication
public class WebApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication2.class,args);
    }

    /*
     * 注册 Servlet
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    /**
     * 注册 Filter
     */
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/second");
        return bean;
    }

    /**
     * 注册listener
     */
    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListener> bean= new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return bean;
    }

}
