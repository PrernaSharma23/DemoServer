package com.example.demoserver.service;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Map;
import java.util.LinkedHashMap;

@Service
public class HealthService {
    private final Instant start = Instant.now();
    private static final String VERSION = "1.0.0-server";

    public Map<String, Object> getHealth() {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("service", "server");
        out.put("status", "ok");
        out.put("version", VERSION);
        double uptime = (double) (Instant.now().toEpochMilli() - start.toEpochMilli()) / 1000.0;
        out.put("uptime_seconds", Math.round(uptime * 100.0) / 100.0);
        out.put("dependencies", Map.of());
        return out;
    }
}
