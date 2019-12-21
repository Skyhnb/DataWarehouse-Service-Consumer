package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByTitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照电影名称查询（Neo4j）")
@RequestMapping("/neo4j/byTitle")
public class QueryByTitleController {

    @Resource
    private QueryByTitleService queryByTitleService;

    @ApiOperation("根据电影名称查询")
    @GetMapping("/getMoviesByTitle")
    public String getMoviesByTitle(@RequestParam("title")String title){
        return queryByTitleService.getMoviesByTitle(title);
    }

    @ApiOperation("测试")
    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByTitleService.test(times);
    }

}
