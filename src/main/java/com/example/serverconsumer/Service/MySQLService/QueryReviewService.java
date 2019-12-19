package com.example.serverconsumer.Service.MySQLService;

import com.example.serverconsumer.entity.QueryEntity.UserReviewInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "mysql-QueryReviewService",url = "@{feign.MySQLUrl}/byReview")
public interface QueryReviewService {
    @PostMapping("/queryByMoodWithName/{db_type}")
    List<String> queryByMoodWithName(@PathVariable String db_type, @RequestBody UserReviewInfo info);

    @PostMapping("/queryByMoodWithId/{db_type}")
    List<String> queryByMoodWithId(@PathVariable String db_type, @RequestBody UserReviewInfo info);

    @PostMapping("/queryByScoreWithName/{db_type}")
    List<String> queryByScoreWithName(@PathVariable String db_type, @RequestBody UserReviewInfo info);

    @PostMapping("/queryByScoreWithId/{db_type}")
    List<String> queryByScoreWithId(@PathVariable String db_type, @RequestBody UserReviewInfo info);

}
