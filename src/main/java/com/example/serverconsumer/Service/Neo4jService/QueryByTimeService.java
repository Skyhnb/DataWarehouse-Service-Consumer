package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}")
public interface QueryByTimeService {
    @GetMapping("/byTime/getMoviesByYear")
    public String getMoviesByYear(@RequestParam("year")Integer year);

    @GetMapping("/byTime/getMoviesByYearMonth")
    public String getMoviesByYearMonth(@RequestParam("year")Integer year, @RequestParam("month")Integer month);

    @GetMapping("/byTime/getMoviesByYearMonthDay")
    public String getMoviesByYearMonthDay(@RequestParam("year")Integer year, @RequestParam("month")Integer month, @RequestParam("day")Integer day);

    @GetMapping("/byTime/getMoviesByYearSeason")
    public String getMoviesByYearSeason(@RequestParam("year")Integer year, @RequestParam("season")Integer season);

    @GetMapping("/byTime/getMoviesByWeekDay")
    public String getMoviesByWeekDay(@RequestParam("weekDay")Integer weekDay, @RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/byTime/test")
    public String test(@RequestParam Integer times) throws Exception;
}
