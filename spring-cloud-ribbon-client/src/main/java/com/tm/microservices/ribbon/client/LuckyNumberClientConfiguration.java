package com.tm.microservices.ribbon.client;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class LuckyNumberClientConfiguration {
    @Autowired
    private IClientConfig ribbonConfig;

    @Bean
    public IPing ribbonPing(IClientConfig ribbonConfig){
        return new PingUrl(false, "/lucky-number");
    }

    @Bean
    public IRule ribbonRule(IClientConfig ribbonConfig){
        return new AvailabilityFilteringRule();
    }
}
