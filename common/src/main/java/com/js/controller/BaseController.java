package com.js.controller;

import com.netflix.discovery.DiscoveryManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(value = "/offline")
    public void offLine() {
        DiscoveryManager.getInstance().shutdownComponent();
    }
}