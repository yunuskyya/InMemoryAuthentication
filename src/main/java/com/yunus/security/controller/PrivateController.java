package com.yunus.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {
    @GetMapping
    public String helloWorldPrivate(){
        return  "hollo world! from private endpoint";
    }
    @GetMapping("/user")
    public String helloWorldUserPrivate(){
        return "hello world! from user private endpoint";
    }
    @GetMapping("/admin")
    public String helloWorldAdminPrivate(){
        return "hello world! from admin private endpoint";
    }



}
