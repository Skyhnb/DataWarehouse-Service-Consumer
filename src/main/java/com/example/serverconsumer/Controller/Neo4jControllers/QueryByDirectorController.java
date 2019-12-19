package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByDirectorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/byDirector")
public class QueryByDirectorController {
    @Resource
    private QueryByDirectorService queryByDirectorService;

    @GetMapping("/getMoviesByDirector")
    public String getMoviesByDirector(@RequestParam("director")String director){
        return queryByDirectorService.getMoviesByDirector(director);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByDirectorService.test(times);
    }
}
