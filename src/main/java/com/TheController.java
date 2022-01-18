package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {
    @Autowired
    private Environment env;

    @GetMapping("/")
    public String sampleApi() {

        return env.getProperty("my.username");
    }
}
