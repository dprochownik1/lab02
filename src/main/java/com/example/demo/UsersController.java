package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
public class UsersController {


    @RequestMapping("/users")
    public String users() {
        return "example";
    }

}

