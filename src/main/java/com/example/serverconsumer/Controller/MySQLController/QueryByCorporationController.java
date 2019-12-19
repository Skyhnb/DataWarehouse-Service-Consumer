package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryByCorporationService;
import com.example.serverconsumer.entity.MySQLEntiy.Corporation;
import com.example.serverconsumer.entity.QueryEntity.Range;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/mysql/byCorporation")
public class QueryByCorporationController {
    @Resource
    private QueryByCorporationService queryByCorporationService;

    @PostMapping("/byActors/{db_type}")
    public List<Corporation> queryBetweenActor(@PathVariable String db_type, @RequestBody Range range){
        return queryByCorporationService.queryBetweenActor(db_type, range);
    }

    @PostMapping("/byActorAndDirector/{db_type}")
    public List<Corporation> byActorAndDirector(@PathVariable String db_type, @RequestBody Range range){
        return queryByCorporationService.byActorAndDirector(db_type, range);
    }
}
