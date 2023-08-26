package com.cyh.springbootversioncontroller.Config;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * @BelongsProject: SpringBootVersionController
 * @BelongsPackage: com.cyh.springbootversioncontroller.Config
 * @Author: CHEN
 * @CreateTime: 2023-08-26  10:36
 * @Description: TODO
 */
public class ApiVersionRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

    /*
     * add @ApiVersion to controller class.
     * @author CHEN
    [handlerType]
     * @return org.springframework.web.servlet.mvc.condition.RequestCondition<?>
     * @date 2023/8/26 0026 10:38
     **/
    @Override
    protected RequestCondition<?> getCustomTypeCondition(Class<?> handlerType) {
        ApiVersion apiVersion = AnnotationUtils.findAnnotation(handlerType, ApiVersion.class);
        return null == apiVersion ? super.getCustomTypeCondition(handlerType) : new ApiVersionCondition(apiVersion.value());
    }

    /*
    add @ApiVersion to controller method.
     */
    @Override
    protected RequestCondition<?> getCustomMethodCondition(Method method) {
        ApiVersion apiVersion = AnnotationUtils.findAnnotation(method, ApiVersion.class);
        return null == apiVersion ? super.getCustomMethodCondition(method) : new ApiVersionCondition(apiVersion.value());
    }
}
