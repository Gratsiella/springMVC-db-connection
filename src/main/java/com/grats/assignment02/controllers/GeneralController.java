
package com.grats.assignment02.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GeneralController {
    
    @GetMapping("/")
    public String goToIndex(){
        return "home";
    }
    
}
