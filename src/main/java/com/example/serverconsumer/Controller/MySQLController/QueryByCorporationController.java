package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryByCorporationService;
import com.example.serverconsumer.entity.MySQLEntiy.Corporation;
import com.example.serverconsumer.entity.QueryEntity.Range;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "按照合作关系查询（MySQL）")
@RequestMapping("/mysql/byCorporation")

public class QueryByCorporationController {
    @Resource
    private QueryByCorporationService queryByCorporationService;

    @ApiOperation(value="根据演员查询")
    @PostMapping("/byActors/{db_type}")
    public String queryBetweenActor(@PathVariable String db_type, @RequestBody Range range){
        return queryByCorporationService.queryBetweenActor(db_type, range);
    }

    @ApiOperation(value = "根据演员，导演查询")
    @PostMapping("/byActorAndDirector/{db_type}")
    public String byActorAndDirector(@PathVariable String db_type, @RequestBody Range range){
        return queryByCorporationService.byActorAndDirector(db_type, range);
    }
}
