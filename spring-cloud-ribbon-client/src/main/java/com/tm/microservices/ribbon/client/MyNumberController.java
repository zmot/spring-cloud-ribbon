package com.tm.microservices.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyNumberController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/my-number")
    public String myNumber() {
        return "My number is: " + restTemplate.getForObject("http://lucky-number-service/lucky-number/", Integer.class);
    }
}
