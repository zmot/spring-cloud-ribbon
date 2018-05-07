package com.tm.microservices.ribbon.client;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RibbonClient(name = "lucky-number-service", configuration = LuckyNumberClientConfiguration.class)
public class Config {
    @Bean
    @LoadBalanced
    public RestTemplate luckyNumberClient(){
        return new RestTemplate();
    }
}
