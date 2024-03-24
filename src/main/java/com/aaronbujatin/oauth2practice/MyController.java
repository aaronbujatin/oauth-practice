package com.aaronbujatin.oauth2practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/")
    public String home(){
        return "This home endpoint";
    }

    @GetMapping("/secured")
    public String secured(){
        return "This is secured endpoint";
    }
}
