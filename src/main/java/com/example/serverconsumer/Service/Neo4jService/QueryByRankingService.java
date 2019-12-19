package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}")
public interface QueryByRankingService {
    @GetMapping("/getMoviesRankingGreaterThan")
    public String getMoviesRankingGreaterThan(@RequestParam("ranking")Float ranking,
                                              @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/getMoviesByRankingGreaterThanEqual")
    public String getMoviesByRankingGreaterThanEqual(@RequestParam("ranking")Float ranking, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/getMoviesByRankingLessThan")
    public String getMoviesByRankingLessThan(@RequestParam("ranking")Float ranking, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);



}
