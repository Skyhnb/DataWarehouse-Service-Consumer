package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByActorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照演员查询（Neo4j）")
@RequestMapping("/neo4j/byActor")
public class QueryByActorController {

    @Resource
    private QueryByActorService queryByActorService;

    @ApiOperation(value = "根据主演名字查询")
    @GetMapping("/getMoviesOfStarring")
    public String getMoviesOfStarring(@RequestParam("starring") String starring){
        return queryByActorService.getMoviesOfStarring(starring);
    }

    @ApiOperation(value = "根据配角名字查询")
    @GetMapping("/getMoviesOfSupportingActor")
    public String getMoviesOfSupportingActor(@RequestParam("supportingActor")String supportingActor){
        return queryByActorService.getMoviesOfSupportingActor(supportingActor);
    }

    @ApiOperation("测试")
    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByActorService.test(times);
    }
}
