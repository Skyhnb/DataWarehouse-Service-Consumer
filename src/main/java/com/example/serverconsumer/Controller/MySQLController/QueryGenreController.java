package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryGenreService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "mysql/byGenre")
@RequestMapping("/mysql/byGenre")
public class QueryGenreController {
    @Resource
    private QueryGenreService queryGenreService;

    @PostMapping("/getGenres/{db_type}")
    public List<String> getGenres(@PathVariable String db_type){
        return queryGenreService.getGenres(db_type);
    }
    @PostMapping("/queryMoviesByGenres/{db_type}")
    public List<String> queryMoviesByGenres(@PathVariable String db_type, @RequestBody List<String> genres){
        return queryGenreService.queryMoviesByGenres(db_type, genres);
    }
}
