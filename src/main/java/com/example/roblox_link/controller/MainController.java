package com.example.roblox_link.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String getPage(@RequestHeader("User-Agent") String userAgent){
        if (userAgent.contains("Android")) {
            System.out.println("Android");
        } else if (userAgent.contains("iPhone") || userAgent.contains("iPad")) {
            System.out.println("iOS");
        } else {
            System.out.println(userAgent);
        }
        return "section";
    }
}
