package com.example.serverconsumer.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}")
public interface Neo4jTest {
    @GetMapping("/test")
    String test();
}
