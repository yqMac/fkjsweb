package com.rookie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rookie on 17/8/17.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String index() {
        return "hi";
    }
}
