package com.solarisbank.demo.codewithme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/code-with-me")
public class CodeWithMeController {

    @GetMapping
    public String hello() {
        return "Code With Me";
    }
}
