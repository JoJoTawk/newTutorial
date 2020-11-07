package com.tawk.spring;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/sampleAPI")
    public String sampleAPI() {
        return  "This is a java Example";
    }
}