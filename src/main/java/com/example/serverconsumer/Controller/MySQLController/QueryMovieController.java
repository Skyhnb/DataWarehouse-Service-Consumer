package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryMovieService;
import com.example.serverconsumer.entity.MySQLEntiy.MovieFact;
import com.example.serverconsumer.entity.MySQLEntiy.Product;
import com.example.serverconsumer.entity.QueryEntity.PersonResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "mysql/byMovieName")
@RequestMapping("/mysql/byMovieName")
public class QueryMovieController {
    @Resource
    private QueryMovieService queryMovieService;

    @PostMapping("/queryProducts/{db_type}")
    public List<Product> queryProducts(@RequestBody MovieFact movieFact, @PathVariable String db_type){
        return queryMovieService.queryProducts(movieFact, db_type);
    }

    @PostMapping("/queryActors/{db_type}")
    public PersonResult queryActors(@RequestBody MovieFact movieFact, @PathVariable String db_type){
        return queryMovieService.queryActors(movieFact, db_type);
    }

    @PostMapping("/querySupportings/{db_type}")
    public PersonResult querySupportings(@RequestBody MovieFact movieFact, @PathVariable String db_type){
        return queryMovieService.querySupportings(movieFact, db_type);
    }

    @PostMapping("/queryStarrings/{db_type}")
    public PersonResult queryStarrings(@RequestBody MovieFact movieFact, @PathVariable String db_type){
        return queryMovieService.queryStarrings(movieFact, db_type);
    }

    @PostMapping("/queryDirectors/{db_type}")
    public PersonResult queryDirectors(@RequestBody MovieFact movieFact, @PathVariable String db_type){
        return queryMovieService.queryDirectors(movieFact, db_type);
    }
}
