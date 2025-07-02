package com.senac.ola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/ola")
    public String ola(){
        return "ola";
    }
    
}
