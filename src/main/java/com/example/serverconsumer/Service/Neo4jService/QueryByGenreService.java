package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-QueryByGenreService",url = "${feign.Neo4jUrl}/byGenre")
public interface QueryByGenreService {
    @GetMapping("/getMoviesByGenre")
    public String getMoviesByGenre(@RequestParam("genre")String genre, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception;
}
