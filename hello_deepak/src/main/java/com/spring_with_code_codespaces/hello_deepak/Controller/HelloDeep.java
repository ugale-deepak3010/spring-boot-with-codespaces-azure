package com.spring_with_code_codespaces.hello_deepak.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class HelloDeep {

    @GetMapping
    public String getHello() {
        return "Hello Deepak!";
    }
    
    

}
