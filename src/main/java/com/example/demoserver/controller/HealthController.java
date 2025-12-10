package com.example.demoserver.controller;

import com.example.demoserver.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HealthController {
    @Autowired
    private HealthService healthService;

    @GetMapping("/health")
    public Map<String, Object> health() {
        return healthService.getHealth();
    }
}
