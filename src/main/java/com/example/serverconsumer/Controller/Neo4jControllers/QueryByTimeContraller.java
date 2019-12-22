package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByTimeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照时间查询（Neo4j）")
@RequestMapping("/neo4j/byTime")
public class QueryByTimeContraller {
    @Resource
    private QueryByTimeService queryByTimeService;

    @ApiOperation(value = "通过年查询")
    @GetMapping("/getMoviesByYear")
    public String getMoviesByYear(@RequestParam("year")Integer year){
        return queryByTimeService.getMoviesByYear(year);
    }

    @ApiOperation(value = "通过年，月查询")
    @GetMapping("/getMoviesByYearMonth")
    public String getMoviesByYearMonth(@RequestParam("year")Integer year, @RequestParam("month")Integer month){
        return queryByTimeService.getMoviesByYearMonth(year, month);
    }

    @ApiOperation(value = "通过年，月，日查询")
    @GetMapping("/getMoviesByYearMonthDay")
    public String getMoviesByYearMonthDay(@RequestParam("year")Integer year,
                                          @RequestParam("month")Integer month, @RequestParam("day")Integer day){
        return queryByTimeService.getMoviesByYearMonthDay(year, month, day);
    }

    @ApiOperation(value = "通过年，季度查询")
    @GetMapping("/getMoviesByYearSeason")
    public String getMoviesByYearSeason(@RequestParam("year")Integer year, @RequestParam("season")Integer season){
        return queryByTimeService.getMoviesByYearSeason(year, season);
    }

    @ApiOperation(value = "通过星期查询")
    @GetMapping("/getMoviesByWeekDay")
    public String getMoviesByWeekDay(@RequestParam("weekDay")Integer weekDay,
                                     @RequestParam("startFrom")Integer startFrom,
                                     @RequestParam("limitation")Integer limitation){
        return queryByTimeService.getMoviesByWeekDay(weekDay, startFrom, limitation);
    }

    @ApiOperation(value = "测试")
    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByTimeService.test(times);
    }
}
