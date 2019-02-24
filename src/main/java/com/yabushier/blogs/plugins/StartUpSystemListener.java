package com.yabushier.blogs.plugins;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartUpSystemListener implements ServletContextListener {
    /**
     * 容器初始化前置方法
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.err.println("------------------------------------------------------");
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextPath = servletContext.getContextPath();
        servletContext.setAttribute("APP_PATH", contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
