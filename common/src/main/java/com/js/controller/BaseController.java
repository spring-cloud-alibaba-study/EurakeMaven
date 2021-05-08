package com.js.controller;

import com.netflix.discovery.DiscoveryManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

//    http://localhost:9001/eureka/apps/OPERATION-SERVICE/10.238.183.28:operation-service:8080
    @GetMapping(value = "/offline")
    public void offLine() {
        DiscoveryManager.getInstance().shutdownComponent();
    }
}