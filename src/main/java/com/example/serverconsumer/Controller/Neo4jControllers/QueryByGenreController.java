package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByGenreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/byGenre")
public class QueryByGenreController {

    @Resource
    private QueryByGenreService queryByGenreService;

    @GetMapping("/getMoviesByGenre")
    public String getMoviesByGenre(@RequestParam("genre")String genre, @RequestParam("startFrom")Integer startFrom,
                                   @RequestParam("limitation")Integer limitation){
        return queryByGenreService.getMoviesByGenre(genre, startFrom, limitation);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByGenreService.test(times);
    }
}
