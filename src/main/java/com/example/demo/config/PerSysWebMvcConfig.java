package com.example.demo.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PerSysWebMvcConfig implements WebMvcConfigurer {

    //日志对象
    private Logger logger = LoggerFactory.getLogger(PerSysWebMvcConfig.class);
    /**
     * 自定义静态资源方法
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/imgs/**")
                .addResourceLocations("file:D://imgs//");
    }

    /**
     * 同意跨域访问配置
     * @param registry
     */

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }
    /**
     * 自定义拦截器
     * @param registry

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
            .addPathPatterns("/**")
                .excludePathPatterns("/imgs/**","/user/toLogin","/user/login");
    }
     */
}
