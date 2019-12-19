package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByTimeService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "neo4j/byTime")
@RequestMapping("/neo4j/byTime")
public class QueryByTimeContraller {
    @Resource
    private QueryByTimeService queryByTimeService;

    @GetMapping("/getMoviesByYear")
    public String getMoviesByYear(@RequestParam("year")Integer year){
        return queryByTimeService.getMoviesByYear(year);
    }

    @GetMapping("/getMoviesByYearMonth")
    public String getMoviesByYearMonth(@RequestParam("year")Integer year, @RequestParam("month")Integer month){
        return queryByTimeService.getMoviesByYearMonth(year, month);
    }

    @GetMapping("/getMoviesByYearMonthDay")
    public String getMoviesByYearMonthDay(@RequestParam("year")Integer year,
                                          @RequestParam("month")Integer month, @RequestParam("day")Integer day){
        return queryByTimeService.getMoviesByYearMonthDay(year, month, day);
    }

    @GetMapping("/getMoviesByYearSeason")
    public String getMoviesByYearSeason(@RequestParam("year")Integer year, @RequestParam("season")Integer season){
        return queryByTimeService.getMoviesByYearSeason(year, season);
    }

    @GetMapping("/getMoviesByWeekDay")
    public String getMoviesByWeekDay(@RequestParam("weekDay")Integer weekDay,
                                     @RequestParam("startFrom")Integer startFrom,
                                     @RequestParam("limitation")Integer limitation){
        return queryByTimeService.getMoviesByWeekDay(weekDay, startFrom, limitation);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByTimeService.test(times);
    }
}
