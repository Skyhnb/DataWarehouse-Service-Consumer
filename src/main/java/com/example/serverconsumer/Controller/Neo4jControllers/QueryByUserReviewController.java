package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByUserReviewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照用户评价查询（Neo4j）")
@RequestMapping("neo4j/byUserReview")
public class QueryByUserReviewController {
    @Resource
    private QueryByUserReviewService queryByUserReviewService;

    @ApiOperation("根据用户名，情感查询")
    @GetMapping("/getMovieAndReviewsByUserNameReviewMood")
    public String getMovieAndReviewsByUserNameReviewMood(@RequestParam("userId")String userId, @RequestParam("mood")String mood){
        return queryByUserReviewService.getMovieAndReviewsByUserNameReviewMood(userId, mood);
    }

    @ApiOperation("根据用户ID，情感查询")
    @GetMapping("/getMovieAndReviewsByUserIdReviewMood")
    public String getMovieAndReviewsByUserIdReviewMood(@RequestParam("userId")String userId, @RequestParam("mood")String mood){
        return queryByUserReviewService.getMovieAndReviewsByUserIdReviewMood(userId, mood);
    }

    @GetMapping("测试")
    public String test(@RequestParam Integer times){
        return queryByUserReviewService.test(times);
    }

    @GetMapping("/compareIndex")
    public String compareIndex(@RequestParam Integer times) throws Exception{
        return queryByUserReviewService.compareIndex(times);
    }

}
