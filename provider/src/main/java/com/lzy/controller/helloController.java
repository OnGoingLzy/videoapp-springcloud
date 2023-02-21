package com.lzy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/20 20:55
 */
@RestController
public class helloController {
    @GetMapping("/test1provider")
    public String test1provider() {
        return "Hello, World!";
    }

}
