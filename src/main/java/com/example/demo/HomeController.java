package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.Path;


@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
    @RequestMapping("/example2/{name}/{age}")
    @ResponseBody
    public String index2(
            @PathVariable String name,
            @PathVariable int age
    ) {
        return "Hello! " + name + " you are " + age + " years old!";
    }
}

