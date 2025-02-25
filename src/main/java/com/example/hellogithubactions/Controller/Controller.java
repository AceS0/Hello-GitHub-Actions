package com.example.hellogithubactions.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/welcome")
    public String sayWelcome(){
        return "welcome";
    }
}
