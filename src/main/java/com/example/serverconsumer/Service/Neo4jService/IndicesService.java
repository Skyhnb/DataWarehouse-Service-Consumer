package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-IndicesService",url = "${feign.Neo4jUrl}/indices")
public interface IndicesService {

    @GetMapping("/deleteIndices")
    String deleteIndices();

    @GetMapping("/createIndices")
    public String createIndices();


}
