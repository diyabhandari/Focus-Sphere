package com.growthapp.Focus_Sphere.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/")
    public String apiRoot(){
        return "hello world";
    }
}
