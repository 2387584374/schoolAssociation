package com.gzjy.sau.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/applications")
public class ApplicationsController {


    @RequestMapping("/applications")
    public String Applications(){

        return "applications/applications";
    }

}
