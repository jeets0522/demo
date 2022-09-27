package com.mannu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/welcome")
    @ResponseBody
    public String test() throws InterruptedException {
        return "Hello Everyone";
    }

    }
