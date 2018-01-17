package com.yf.web.ai.base;

import com.yf.web.ai.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author YangLF
 * @date 2018/1/17
 */
@Component
@WebFilter(filterName = "myFilter",urlPatterns = "/**")
public class MyFilter implements Filter {

    @Autowired
    private User user;

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("初始化过滤器:"+user.getName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("请求之前处理...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("请求之后处理...");
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器...");
    }
}
