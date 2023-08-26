package com.cyh.springbootversioncontroller.Config;
import org.springframework.web.bind.annotation.Mapping;
import java.lang.annotation.*;

/**
 * @BelongsProject: SpringBootVersionController
 * @BelongsPackage: com.cyh.springbootversioncontroller.Config
 * @Author: CHEN
 * @CreateTime: 2023-08-26  10:23
 * @Description: 自定义@ApiVersion注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    String value();
}
