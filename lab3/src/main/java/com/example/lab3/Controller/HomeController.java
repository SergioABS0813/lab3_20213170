package com.example.lab3.Controller;

import org.aspectj.lang.annotation.DeclareWarning;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
public class HomeController {

    @GetMapping(value = {"/index"})
    public String indexView(){
        return "index";
    }

}
