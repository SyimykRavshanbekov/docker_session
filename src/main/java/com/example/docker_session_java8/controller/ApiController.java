package com.example.docker_session_java8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String helloMethod() {
        return "index";
    }
}
