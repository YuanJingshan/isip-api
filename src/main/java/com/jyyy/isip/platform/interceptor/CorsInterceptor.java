package com.jyyy.isip.platform.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Yuan Jingshan
 * @version 1.0
 * @description 跨越配置
 * @date Create in 2018/12/3 18:39
 */
@Configuration
public class CorsInterceptor implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedMethods("*")
                .allowedOrigins("*")
                .maxAge(3600);
    }
}
