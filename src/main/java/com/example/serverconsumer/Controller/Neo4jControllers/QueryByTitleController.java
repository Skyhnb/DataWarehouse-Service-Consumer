package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByTitleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/neo4j/byTitle")
public class QueryByTitleController {

    @Resource
    private QueryByTitleService queryByTitleService;

    @GetMapping("/getMoviesByTitle")
    public String getMoviesByTitle(@RequestParam("title")String title){
        return queryByTitleService.getMoviesByTitle(title);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByTitleService.test(times);
    }

}
