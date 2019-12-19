package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.ItemQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/item")
public class ItemQueryController {

    @Resource
    private ItemQueryService itemQueryService;

    @GetMapping("/getRandomActors")
    public String getRandomActors(@RequestParam Integer count){
        return itemQueryService.getRandomActors(count);
    }

    @GetMapping("/getRandomDirectors")
    public String getRandomDirectors(@RequestParam Integer count){
        return itemQueryService.getRandomDirectors(count);
    }

    @GetMapping("/getGenres")
    public String getGenres(){
        return itemQueryService.getGenres();
    }

    @GetMapping("/getRandomUsers")
    public String getRandomUsers(@RequestParam Integer count){
        return itemQueryService.getRandomUsers(count);
    }

    @GetMapping("/getRandomReviews")
    public String getRandomReviews(@RequestParam Integer count){
        return itemQueryService.getRandomReviews(count);
    }

    @GetMapping("/getRandomMovies")
    public String getRandomMovies(@RequestParam Integer count){
        return itemQueryService.getRandomMovies(count);
    }

    @GetMapping("/getRandomProducts")
    public String getRandomProducts(@RequestParam Integer count){
        return itemQueryService.getRandomProducts(count);
    }
}
