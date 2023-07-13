package ru.micro.example.client2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class NewController {

    @GetMapping("/go")
    public String go() {
        return "go";
    }
}
