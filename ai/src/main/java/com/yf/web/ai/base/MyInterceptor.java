package com.yf.web.ai.base;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 拦截器  过滤器可以修改request，而拦截器不能
 * 过滤器需要在servlet容器中实现，拦截器可以适用于javaEE，javaSE等各种环境
 * 拦截器可以调用IOC容器中的各种依赖，而过滤器不能
 * 过滤器只能在请求的前后使用，而拦截器可以详细到每个方法
 *
 * @author YangLF
 * @date 2018/1/17
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws IOException {
        //请求 controller 之前
        //返回false 取消请求  true 继续请求
        String requestURI = httpServletRequest.getRequestURI();
        System.out.println("请求url:" + requestURI);
        /*if (requestURI.endsWith("getOldData")) {
            httpServletResponse.sendRedirect("http://www.baidu.com?"+requestURI);
           return false;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {
        //调用controller之后，视图渲染之前
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //在整个请求结束之后被调用 主要是用于进行资源清理工作
    }
}
