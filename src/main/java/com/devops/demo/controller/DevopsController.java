package com.devops.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping(path = "/get")
    public String getData(){

        return "Hello Devops";
    }

}
