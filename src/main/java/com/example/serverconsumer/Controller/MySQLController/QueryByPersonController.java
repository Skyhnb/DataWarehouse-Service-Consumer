package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryByPersonService;
import com.example.serverconsumer.entity.MySQLEntiy.Person;
import com.example.serverconsumer.entity.QueryEntity.MovieResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "按照演员名字查询（MySQL）")
@RequestMapping("/mysql/byPerson")
public class QueryByPersonController {
    @Resource
    private QueryByPersonService queryByPersonService;

    @ApiOperation(value = "根据演员查询")
    @PostMapping("/queryByActor/{db_type}")
    public MovieResult queryByActor(@PathVariable String db_type, @RequestBody Person person){
        return queryByPersonService.queryByActor(db_type, person);
    }

    @ApiOperation(value = "根据演员（join）查询")
    @PostMapping("/queryByActorWithJoin/{db_type}")
    public List<String> queryByActorWithJoin(@PathVariable String db_type, @RequestBody Person person){
        return queryByPersonService.queryByActorWithJoin(db_type, person);
    }

    @ApiOperation(value = "根据配角查询")
    @PostMapping("/queryBySupporting/{db_type}")
    public MovieResult queryBySupporting(@PathVariable String db_type,@RequestBody Person person){
        return queryByPersonService.queryBySupporting(db_type, person);
    }

    @ApiOperation(value = "根据主演查询")
    @PostMapping("/queryByStarring/{db_type}")
    public MovieResult queryByStarring(@PathVariable String db_type,@RequestBody Person person){
        return queryByPersonService.queryByStarring(db_type, person);
    }

    @ApiOperation(value = "根据导演查询")
    @PostMapping("/queryByDirector/{db_type}")
    public MovieResult queryByDirector(@PathVariable String db_type,@RequestBody Person person){
        return queryByPersonService.queryByDirector(db_type, person);
    }
}
