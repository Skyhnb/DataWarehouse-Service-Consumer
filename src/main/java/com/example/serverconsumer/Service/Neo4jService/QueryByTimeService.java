package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-QueryByTimeService",url = "${feign.Neo4jUrl}/byTime")
public interface QueryByTimeService {
    @GetMapping("/getMoviesByYear")
     String getMoviesByYear(@RequestParam("year")Integer year);

    @GetMapping("/getMoviesByYearMonth")
     String getMoviesByYearMonth(@RequestParam("year")Integer year, @RequestParam("month")Integer month);

    @GetMapping("/getMoviesByYearMonthDay")
     String getMoviesByYearMonthDay(@RequestParam("year")Integer year, @RequestParam("month")Integer month, @RequestParam("day")Integer day);

    @GetMapping("/getMoviesByYearSeason")
     String getMoviesByYearSeason(@RequestParam("year")Integer year, @RequestParam("season")Integer season);

    @GetMapping("/getMoviesByWeekDay")
     String getMoviesByWeekDay(@RequestParam("weekDay")Integer weekDay, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/test")
     String test(@RequestParam Integer times) throws Exception;
}
