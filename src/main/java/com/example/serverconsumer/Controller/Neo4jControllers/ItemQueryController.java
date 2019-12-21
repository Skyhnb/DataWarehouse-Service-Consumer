package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.ItemQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "随机查询一些数据（Neo4j）")
@RequestMapping("/neo4j/item")
public class ItemQueryController {

    @Resource
    private ItemQueryService itemQueryService;

    @ApiOperation("随机获取演员")
    @GetMapping("/getRandomActors")
    public String getRandomActors(@RequestParam Integer count){
        return itemQueryService.getRandomActors(count);
    }

    @ApiOperation(value = "随机获取导演")
    @GetMapping("/getRandomDirectors")
    public String getRandomDirectors(@RequestParam Integer count){
        return itemQueryService.getRandomDirectors(count);
    }

    @ApiOperation(value = "获取电影类型")
    @GetMapping("/getGenres")
    public String getGenres(){
        return itemQueryService.getGenres();
    }

    @ApiOperation(value = "随机获取用户")
    @GetMapping("/getRandomUsers")
    public String getRandomUsers(@RequestParam Integer count){
        return itemQueryService.getRandomUsers(count);
    }

    @ApiOperation("随机获取评论")
    @GetMapping("/getRandomReviews")
    public String getRandomReviews(@RequestParam Integer count){
        return itemQueryService.getRandomReviews(count);
    }

    @ApiOperation(value = "随机获取电影")
    @GetMapping("/getRandomMovies")
    public String getRandomMovies(@RequestParam Integer count){
        return itemQueryService.getRandomMovies(count);
    }

    @ApiOperation("随机获取电影版本")
    @GetMapping("/getRandomProducts")
    public String getRandomProducts(@RequestParam Integer count){
        return itemQueryService.getRandomProducts(count);
    }
}
