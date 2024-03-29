package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByGenreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照电影类别查询（Neo4j）")
@RequestMapping("/neo4j/byGenre")
public class QueryByGenreController {

    @Resource
    private QueryByGenreService queryByGenreService;

    @ApiOperation("根据电影类别查询")
    @GetMapping("/getMoviesByGenre")
    public String getMoviesByGenre(@RequestParam("genre")String genre, @RequestParam("startFrom")Integer startFrom,
                                   @RequestParam("limitation")Integer limitation){
        return queryByGenreService.getMoviesByGenre(genre, startFrom, limitation);
    }

    @ApiOperation("测试")
    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByGenreService.test(times);
    }
}
