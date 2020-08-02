package org.it.finalwork.config;

import org.it.finalwork.component.LoginHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        LoginHandler loginHandler = new LoginHandler();
        InterceptorRegistration loginRegistry = registry.addInterceptor(loginHandler);
        //拦截路径
        loginRegistry.addPathPatterns("/home","/receive","/due","/finance","/payback","/transfer");
    }
}
