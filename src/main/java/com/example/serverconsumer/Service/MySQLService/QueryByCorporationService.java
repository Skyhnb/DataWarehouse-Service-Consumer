package com.example.serverconsumer.Service.MySQLService;

import com.example.serverconsumer.entity.MySQLEntiy.Corporation;
import com.example.serverconsumer.entity.QueryEntity.Range;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "MySQL-Service-Provider", url = "@{feign.MySQLUrl}/byCorporation")
public interface QueryByCorporationService {
    @PostMapping("/byActors/{db_type}")
     List<Corporation> queryBetweenActor(@PathVariable String db_type, @RequestBody Range range);

    @PostMapping("/byActorAndDirector/{db_type}")
     List<Corporation> byActorAndDirector(@PathVariable String db_type, @RequestBody Range range);

}
