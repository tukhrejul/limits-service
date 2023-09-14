package com.in28minutes.microservice.limitsservice.controller;

import com.in28minutes.microservice.limitsservice.bean.Limits;
import com.in28minutes.microservice.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController
{
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retriveLimits()
    {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
