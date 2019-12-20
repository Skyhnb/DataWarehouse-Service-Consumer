package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryByTimeService;
import com.example.serverconsumer.entity.MySQLEntiy.Date;
import com.example.serverconsumer.entity.QueryEntity.MovieResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照时间查询（MySQL）")
@RequestMapping("/mysql/byTime")
public class QueryByTimeController {
    @Resource
    private QueryByTimeService queryByTimeService;

    @PostMapping("queryByDate/{db_type}")
    public MovieResult queryByTime(@PathVariable String db_type, @RequestBody Date condition){
        return queryByTimeService.queryByTime(db_type, condition);
    }

    @PostMapping("queryBySeason/{db_type}")
    public MovieResult queryBySeason(@PathVariable String db_type, @RequestBody Date condition){
        return queryByTimeService.queryBySeason(db_type, condition);
    }

}
