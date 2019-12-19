package com.example.serverconsumer.Service.MySQLService;

import com.example.serverconsumer.entity.MySQLEntiy.Person;
import com.example.serverconsumer.entity.QueryEntity.MovieResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "MySQL-Service-Provider", url = "@{feign.MySQLUrl}/byPerson")
public interface QueryByPersonService {
    @PostMapping("/queryByActor/{db_type}")
     MovieResult queryByActor(@PathVariable String db_type, @RequestBody Person person);

    @PostMapping("/queryByActorWithJoin/{db_type}")
     List<String> queryByActorWithJoin(@PathVariable String db_type, @RequestBody Person person);

    @PostMapping("/queryBySupporting/{db_type}")
     MovieResult queryBySupporting(@PathVariable String db_type,@RequestBody Person person);

    @PostMapping("/queryByStarring/{db_type}")
    MovieResult queryByStarring(@PathVariable String db_type,@RequestBody Person person);

    @PostMapping("/queryByDirector/{db_type}")
    MovieResult queryByDirector(@PathVariable String db_type,@RequestBody Person person);
}
