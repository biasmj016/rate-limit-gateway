package com.ratelimit.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/api/endpoint")
    public String getResponse() {
        return "Response";
    }
}