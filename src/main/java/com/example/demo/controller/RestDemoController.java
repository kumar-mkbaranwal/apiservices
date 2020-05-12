package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/demo")
public class RestDemoController {
    @RequestMapping(value = "/detail", method= RequestMethod.GET)
    public String getDetail(@RequestParam(value="name") String name) {
        return name;
    }

}
