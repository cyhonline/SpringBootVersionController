package com.cyh.springbootversioncontroller.Controller;

import com.cyh.springbootversioncontroller.Config.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: SpringBootVersionController
 * @BelongsPackage: com.cyh.springbootversioncontroller.Controller
 * @Author: CHEN
 * @CreateTime: 2023-08-26  10:45
 * @Description: TODO
 */
@RestController
@RequestMapping("api/{v}/user")
public class UserController {

    @RequestMapping("get")
    public String getUser() {
        return "default";
    }

    @ApiVersion("1.0.0")
    @RequestMapping("get")
    public String getUserV1() {
        return "v1.0.0";
    }

    @ApiVersion("1.1.0")
    @RequestMapping("get")
    public String getUserV11() {
        return "1.1.0";
    }

    @ApiVersion("1.1.2")
    @RequestMapping("get")
    public String getUserV112() {
        return "1.1.2";
    }
}
