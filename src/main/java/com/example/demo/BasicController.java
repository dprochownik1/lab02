package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BasicController {

    @RequestMapping("/basicc")
    public String basic() {
        return "example";
    }

}

