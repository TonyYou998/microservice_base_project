package com.uit.microservice_base_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class BaseController {
    public BaseController() {
    }

    @GetMapping
    public Object BaseCOntroller() {
        return "Hello world";
    }
}
