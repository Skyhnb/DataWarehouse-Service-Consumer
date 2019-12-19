package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryByPersonService;
import com.example.serverconsumer.entity.MySQLEntiy.Person;
import com.example.serverconsumer.entity.QueryEntity.MovieResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/mysql/byPerson")
public class QueryByPersonController {
    @Resource
    private QueryByPersonService queryByPersonService;

    @PostMapping("/queryByActor/{db_type}")
    public MovieResult queryByActor(@PathVariable String db_type, @RequestBody Person person){
        return queryByPersonService.queryByActor(db_type, person);
    }

    @PostMapping("/queryByActorWithJoin/{db_type}")
    public List<String> queryByActorWithJoin(@PathVariable String db_type, @RequestBody Person person){
        return queryByPersonService.queryByActorWithJoin(db_type, person);
    }

    @PostMapping("/queryBySupporting/{db_type}")
    public MovieResult queryBySupporting(@PathVariable String db_type,@RequestBody Person person){
        return queryByPersonService.queryBySupporting(db_type, person);
    }

    @PostMapping("/queryByStarring/{db_type}")
    public MovieResult queryByStarring(@PathVariable String db_type,@RequestBody Person person){
        return queryByPersonService.queryByStarring(db_type, person);
    }

    @PostMapping("/queryByDirector/{db_type}")
    public MovieResult queryByDirector(@PathVariable String db_type,@RequestBody Person person){
        return queryByPersonService.queryByDirector(db_type, person);
    }
}
