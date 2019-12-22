package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByDirectorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照导演查询（Neo4j）")
@RequestMapping("/neo4j/byDirector")
public class QueryByDirectorController {
    @Resource
    private QueryByDirectorService queryByDirectorService;

    @ApiOperation("通过导演名字查询")
    @GetMapping("/getMoviesByDirector")
    public String getMoviesByDirector(@RequestParam("director")String director){
        return queryByDirectorService.getMoviesByDirector(director);
    }

    @ApiOperation("测试")
    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByDirectorService.test(times);
    }
}
