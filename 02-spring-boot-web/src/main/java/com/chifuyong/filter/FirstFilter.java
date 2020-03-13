package com.chifuyong.filter;

import org.springframework.context.annotation.ComponentScan;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
/*
* SpringBoot整合Filter
*/
@WebFilter("/first")
public class FirstFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
            System.out.println("开始FirstFilter！");
            chain.doFilter(request,response);
            System.out.println("结束FirstFilter! ");
    }


}
