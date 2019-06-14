package com.lsh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @ClassName WebConfig
 * @Description: SpringBoot自定义参数解析器
 * @Author lsh
 * @Date 2019/6/12 21:39
 * @Version
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Autowired
    UserArgumentResolver userArgumentResolver;

    /**
     *添加参数解析器
     * @param argumentResolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(userArgumentResolver);
    }
}
