package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByActorService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "neo4j/byActor")
@RequestMapping("/neo4j/byActor")
public class QueryByActorController {

    @Resource
    private QueryByActorService queryByActorService;

    @GetMapping("/getMoviesOfStarring")
    public String getMoviesOfStarring(@RequestParam("starring") String starring){
        return queryByActorService.getMoviesOfStarring(starring);
    }

    @GetMapping("/getMoviesOfSupportingActor")
    public String getMoviesOfSupportingActor(@RequestParam("supportingActor")String supportingActor){
        return queryByActorService.getMoviesOfSupportingActor(supportingActor);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByActorService.test(times);
    }
}
