package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByRankingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/neo4j/byRanking")
public class QueryByRankingController {
    @Resource
    private QueryByRankingService queryByRankingService;

    @GetMapping("/getMoviesRankingGreaterThan")
    public String getMoviesRankingGreaterThan(@RequestParam("ranking")Float ranking,
                                              @RequestParam("startFrom")Integer startFrom,
                                              @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesRankingGreaterThan(ranking, startFrom, limitation);
    }

    @GetMapping("/getMoviesByRankingGreaterThanEqual")
    public String getMoviesByRankingGreaterThanEqual(@RequestParam("ranking")Float ranking,
                                                     @RequestParam("startFrom")Integer startFrom,
                                                     @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesByRankingGreaterThanEqual(ranking, startFrom, limitation);
    }

    @GetMapping("/getMoviesByRankingLessThan")
    public String getMoviesByRankingLessThan(@RequestParam("ranking")Float ranking,
                                             @RequestParam("startFrom")Integer startFrom,
                                             @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesByRankingLessThan(ranking, startFrom, limitation);
    }

    @GetMapping("/getMoviesByRankingLessThanEqual")
    public String getMoviesByRankingLessThanEqual(@RequestParam("ranking")Float ranking,
                                                  @RequestParam("startFrom")Integer startFrom,
                                                  @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesByRankingLessThanEqual(ranking, startFrom, limitation);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByRankingService.test(times);
    }
}
