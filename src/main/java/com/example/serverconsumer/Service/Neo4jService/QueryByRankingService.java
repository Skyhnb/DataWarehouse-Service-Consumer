package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-QueryByRankingService",url = "${feign.Neo4jUrl}/byRanking")
public interface QueryByRankingService {
    @GetMapping("/getMoviesRankingGreaterThan")
     String getMoviesRankingGreaterThan(@RequestParam("ranking")Float ranking,
                                              @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/getMoviesByRankingGreaterThanEqual")
     String getMoviesByRankingGreaterThanEqual(@RequestParam("ranking")Float ranking, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/getMoviesByRankingLessThan")
     String getMoviesByRankingLessThan(@RequestParam("ranking")Float ranking, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/getMoviesByRankingLessThanEqual")
     String getMoviesByRankingLessThanEqual(@RequestParam("ranking")Float ranking, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/test")
     String test(@RequestParam Integer times) throws Exception;

}
