package com.example.serverconsumer.Service.MySQLService;

import com.example.serverconsumer.entity.MySQLEntiy.Date;
import com.example.serverconsumer.entity.QueryEntity.MovieResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "mysql-QueryByTimeService",url = "@{feign.MySQLUrl}/byTime")
public interface QueryByTimeService {
    @PostMapping("queryByDate/{db_type}")
     MovieResult queryByTime(@PathVariable String db_type, @RequestBody Date condition);

    @PostMapping("queryBySeason/{db_type}")
     MovieResult queryBySeason(@PathVariable String db_type, @RequestBody Date condition);

}
