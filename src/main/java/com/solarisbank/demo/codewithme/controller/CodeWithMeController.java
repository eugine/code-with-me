package com.solarisbank.demo.codewithme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.commons.text.StringEscapeUtils.escapeXml10;

@RestController
@RequestMapping("/api/code-with-me")
public class CodeWithMeController {

    @GetMapping
    public String hello() {
        return escapeXml10("Code With Me");
    }
}
