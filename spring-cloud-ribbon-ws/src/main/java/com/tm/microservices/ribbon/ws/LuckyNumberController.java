package com.tm.microservices.ribbon.ws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyNumberController {

    @Value("${lucky.number}")
    private int luckyNumber;

    @GetMapping("lucky-number")
    public int luckyNumber() {
        return luckyNumber;
    }
}
