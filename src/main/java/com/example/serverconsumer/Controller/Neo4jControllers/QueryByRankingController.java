package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByRankingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照评分查询（Neo4j）")
@RequestMapping("/neo4j/byRanking")
public class QueryByRankingController {
    @Resource
    private QueryByRankingService queryByRankingService;

    @ApiOperation("根据评分（>）查询")
    @GetMapping("/getMoviesRankingGreaterThan")
    public String getMoviesRankingGreaterThan(@RequestParam("ranking")Float ranking,
                                              @RequestParam("startFrom")Integer startFrom,
                                              @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesRankingGreaterThan(ranking, startFrom, limitation);
    }

    @ApiOperation("根据评分（≥）查询")
    @GetMapping("/getMoviesByRankingGreaterThanEqual")
    public String getMoviesByRankingGreaterThanEqual(@RequestParam("ranking")Float ranking,
                                                     @RequestParam("startFrom")Integer startFrom,
                                                     @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesByRankingGreaterThanEqual(ranking, startFrom, limitation);
    }

    @ApiOperation("根据评分（<）查询")
    @GetMapping("/getMoviesByRankingLessThan")
    public String getMoviesByRankingLessThan(@RequestParam("ranking")Float ranking,
                                             @RequestParam("startFrom")Integer startFrom,
                                             @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesByRankingLessThan(ranking, startFrom, limitation);
    }

    @ApiOperation("根据评分（≦）查询")
    @GetMapping("/getMoviesByRankingLessThanEqual")
    public String getMoviesByRankingLessThanEqual(@RequestParam("ranking")Float ranking,
                                                  @RequestParam("startFrom")Integer startFrom,
                                                  @RequestParam("limitation")Integer limitation){
        return queryByRankingService.getMoviesByRankingLessThanEqual(ranking, startFrom, limitation);
    }

    @ApiOperation("测试")
    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByRankingService.test(times);
    }
}
