package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryCombinationService;
import com.example.serverconsumer.entity.QueryEntity.UserWithGenre;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/mysql/byCombination")
@Api(tags = "组合查询（MySQL）")
@RestController
public class QueryCombinationController {
    @Resource
    private QueryCombinationService queryCombinationService;

    @PostMapping("/queryWithGenreAndActor/{db_type}")
   public String queryWithGenreAndActor(@PathVariable String db_type, @RequestBody UserWithGenre user){
        return queryCombinationService.queryWithGenreAndActor(db_type, user);
    }

}
