package com.mbsystems.ss_2022_c1_ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello Basil";
    }
}
