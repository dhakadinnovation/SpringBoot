package com.dhakad.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHi()
    {
        return "Hi";
    }
}
