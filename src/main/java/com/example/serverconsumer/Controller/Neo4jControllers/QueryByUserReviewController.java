package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByUserReviewService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照用户评论查询（Neo4j）")
@RequestMapping("neo4j/byUserReview")
public class QueryByUserReviewController {
    @Resource
    private QueryByUserReviewService queryByUserReviewService;

    @GetMapping("/getMovieAndReviewsByUserNameReviewMood")
    public String getMovieAndReviewsByUserNameReviewMood(@RequestParam("userName")String userName, @RequestParam("mood")String mood){
        return queryByUserReviewService.getMovieAndReviewsByUserNameReviewMood(userName, mood);
    }

    @GetMapping("/getMovieAndReviewsByUserIdReviewMood")
    public String getMovieAndReviewsByUserIdReviewMood(@RequestParam("userId")String userId, @RequestParam("mood")String mood){
        return queryByUserReviewService.getMovieAndReviewsByUserIdReviewMood(userId, mood);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer times){
        return queryByUserReviewService.test(times);
    }

    @GetMapping("/compareIndex")
    public String compareIndex(@RequestParam Integer times) throws Exception{
        return queryByUserReviewService.compareIndex(times);
    }

}
