package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryReviewService;
import com.example.serverconsumer.entity.QueryEntity.UserReviewInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "mysql/byReview")
@RequestMapping("/mysql/byReview")
public class QueryReviewController {
    @Resource
    private QueryReviewService queryReviewService;

    @PostMapping("/queryByMoodWithName/{db_type}")
    public List<String> queryByMoodWithName(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByMoodWithName(db_type, info);
    }

    @PostMapping("/queryByMoodWithId/{db_type}")
    public List<String> queryByMoodWithId(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByMoodWithId(db_type, info);
    }

    @PostMapping("/queryByScoreWithName/{db_type}")
    public List<String> queryByScoreWithName(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByScoreWithName(db_type, info);
    }

    @PostMapping("/queryByScoreWithId/{db_type}")
    public List<String> queryByScoreWithId(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByScoreWithId(db_type, info);
    }
}
