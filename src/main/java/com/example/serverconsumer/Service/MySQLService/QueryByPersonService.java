package com.example.serverconsumer.Service.MySQLService;

import com.example.serverconsumer.entity.MySQLEntiy.Person;
import com.example.serverconsumer.entity.QueryEntity.MovieResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "mysql-QueryByPersonService",url = "${feign.MySQLUrl}/byPerson")
public interface QueryByPersonService {
    @PostMapping("/queryByActor/{db_type}")
    String queryByActor(@PathVariable String db_type, @RequestBody Person person);

    @PostMapping("/queryByActorWithJoin/{db_type}")
    String queryByActorWithJoin(@PathVariable String db_type, @RequestBody Person person);

    @PostMapping("/queryBySupporting/{db_type}")
    String queryBySupporting(@PathVariable String db_type,@RequestBody Person person);

    @PostMapping("/queryByStarring/{db_type}")
    String queryByStarring(@PathVariable String db_type,@RequestBody Person person);

    @PostMapping("/queryByDirector/{db_type}")
    String queryByDirector(@PathVariable String db_type,@RequestBody Person person);
}
