package com.example.serverconsumer.Service.MySQLService;

import com.example.serverconsumer.entity.QueryEntity.UserWithGenre;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "mysql-QueryCombinationService", url = "${feign.MySQLUrl}/byCombination")
public interface QueryCombinationService {
    @PostMapping("/queryWithGenreAndActor/{db_type}")
    String queryWithGenreAndActor(@PathVariable String db_type, @RequestBody UserWithGenre user);
}
