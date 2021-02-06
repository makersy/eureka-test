package top.haoliny.eureka_client0.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yhl
 * @date 2021/2/6
 * @description
 */

@RestController
public class HelloController {

    @Value("${env}")
    private String env;

    @RequestMapping("/hello")
    public String index() {
        return "hello, this is " + env;
    }
}
