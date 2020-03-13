package com.chifuyong.filter;

import javax.servlet.*;
import java.io.IOException;
/*
 * SpringBoot整合Filter
 */
public class SecondFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("开始SecondFilter！");
        chain.doFilter(request,response);
        System.out.println("结束SecondFilter! ");
    }

}
