package com.yangsh.pmd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 * <p></p>
 * Author: shaoye
 * Date: 2019-05-10 07:24
 */
@RestController
public class HelloController {

    /**
     * http://127.0.0.1:9999/hello
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
