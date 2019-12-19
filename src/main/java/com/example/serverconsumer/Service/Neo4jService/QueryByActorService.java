package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-QueryByActorService",url = "${feign.Neo4jUrl}/byActor")
public interface QueryByActorService {
    @GetMapping("/getMoviesOfStarring")
     String getMoviesOfStarring(@RequestParam("starring") String starring);

    @GetMapping("/getMoviesOfSupportingActor")
     String getMoviesOfSupportingActor(@RequestParam("supportingActor")String supportingActor);

    @GetMapping("/test")
     String test(@RequestParam Integer times) throws Exception;

}
