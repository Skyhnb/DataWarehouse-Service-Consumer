package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}")
public interface QueryByDirectorService {
}
