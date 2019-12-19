package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}/item")
public interface ItemQueryService {
    @GetMapping("/getRandomActors")
    String getRandomActors(@RequestParam Integer count);

    @GetMapping("/getRandomDirectors")
    String getRandomDirectors(@RequestParam Integer count);

    @GetMapping("/getGenres")
    String getGenres();

    @GetMapping("/getRandomUsers")
    String getRandomUsers(@RequestParam Integer count) ;

    @GetMapping("/getRandomReviews")
    String getRandomReviews(@RequestParam Integer count);

    @GetMapping("/getRandomMovies")
    String getRandomMovies(@RequestParam Integer count);

    @GetMapping("/getRandomProducts")
    String getRandomProducts(@RequestParam Integer count);

}
