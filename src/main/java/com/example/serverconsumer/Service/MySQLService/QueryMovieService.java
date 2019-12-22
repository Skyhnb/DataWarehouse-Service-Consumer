package com.example.serverconsumer.Service.MySQLService;

import com.example.serverconsumer.entity.MySQLEntiy.MovieFact;
import com.example.serverconsumer.entity.MySQLEntiy.Product;
import com.example.serverconsumer.entity.QueryEntity.MovieProducts;
import com.example.serverconsumer.entity.QueryEntity.PersonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "mysql-QueryMovieService",url = "${feign.MySQLUrl}/byMovieName")
public interface QueryMovieService {
    @PostMapping("/queryProducts/{db_type}")
    String queryProducts(@RequestBody MovieFact movieFact, @PathVariable String db_type);

    @PostMapping("/queryActors/{db_type}")
    String queryActors(@RequestBody MovieFact movieFact, @PathVariable String db_type);

    @PostMapping("/querySupportings/{db_type}")
    String querySupportings(@RequestBody MovieFact movieFact, @PathVariable String db_type);

    @PostMapping("/queryStarrings/{db_type}")
    String queryStarrings(@RequestBody MovieFact movieFact, @PathVariable String db_type);

    @PostMapping("/queryDirectors/{db_type}")
    String queryDirectors(@RequestBody MovieFact movieFact, @PathVariable String db_type);

}
