package com.yabushier.blogs.config;

import com.yabushier.blogs.plugins.StartUpSystemListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

//@Configuration
public class ListenerConfig {
    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<StartUpSystemListener> registrationBean = new ServletListenerRegistrationBean<>(new StartUpSystemListener());
        return registrationBean;
    }
}
