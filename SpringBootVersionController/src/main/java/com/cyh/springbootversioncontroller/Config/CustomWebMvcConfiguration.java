package com.cyh.springbootversioncontroller.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @BelongsProject: SpringBootVersionController
 * @BelongsPackage: com.cyh.springbootversioncontroller.Config
 * @Author: CHEN
 * @CreateTime: 2023-08-26  10:39
 * @Description: TODO
 */
@Configuration
public class CustomWebMvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    public RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new ApiVersionRequestMappingHandlerMapping();
    }
}
