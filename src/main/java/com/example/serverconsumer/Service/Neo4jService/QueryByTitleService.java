package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}/byTitle")
public interface QueryByTitleService {
    @GetMapping("/getMoviesByTitle")
     String getMoviesByTitle(@RequestParam("title")String title);

    @GetMapping("/test")
     String test(@RequestParam Integer times) throws Exception;

}

