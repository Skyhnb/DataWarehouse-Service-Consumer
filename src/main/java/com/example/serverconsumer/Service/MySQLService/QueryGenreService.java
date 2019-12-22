package com.example.serverconsumer.Service.MySQLService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "mysql-QueryGenreService",url = "${feign.MySQLUrl}/byGenre")
public interface QueryGenreService {
    @PostMapping("/getGenres/{db_type}")
    String getGenres(@PathVariable String db_type);

    @PostMapping("/queryMoviesByGenres/{db_type}")
    String queryMoviesByGenres(@PathVariable String db_type, @RequestBody List<String> genres);
}
