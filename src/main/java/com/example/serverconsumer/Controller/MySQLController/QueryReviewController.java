package com.example.serverconsumer.Controller.MySQLController;

import com.example.serverconsumer.Service.MySQLService.QueryReviewService;
import com.example.serverconsumer.entity.QueryEntity.UserReviewInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "按照用户评价查询（MySQL）")
@RequestMapping("/mysql/byReview")
public class QueryReviewController {
    @Resource
    private QueryReviewService queryReviewService;

    @ApiOperation(value="根据用户名，情感查询")
    @PostMapping("/queryByMoodWithName/{db_type}")
    public String queryByMoodWithName(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByMoodWithName(db_type, info);
    }

    @ApiOperation(value="根据用户ID，情感查询")
    @PostMapping("/queryByMoodWithId/{db_type}")
    public String queryByMoodWithId(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByMoodWithId(db_type, info);
    }

    @ApiOperation(value="根据用户名，评分查询")
    @PostMapping("/queryByScoreWithName/{db_type}")
    public String queryByScoreWithName(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByScoreWithName(db_type, info);
    }

    @ApiOperation(value="根据用户ID，评分查询")
    @PostMapping("/queryByScoreWithId/{db_type}")
    public String queryByScoreWithId(@PathVariable String db_type, @RequestBody UserReviewInfo info){
        return queryReviewService.queryByScoreWithId(db_type, info);
    }
}
