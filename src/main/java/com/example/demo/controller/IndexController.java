package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Li Huiqin
 * @version 1.0
 * @date 2020/1/13 10:19
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}

