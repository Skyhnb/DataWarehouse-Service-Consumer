package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}/byUserReview")
public interface QueryByUserReviewService {
    @GetMapping("/getMovieAndReviewsByUserIdScoreGreaterThan")
    public String getMovieAndReviewsByUserIdScoreGreaterThan(@RequestParam("userId")String userId, @RequestParam("score")Float score);

    @GetMapping("/getMovieAndReviewsByUserIdReviewScoreGreaterThanEqual")
    public String getMovieAndReviewsByUserIdReviewScoreGreaterThanEqual(@RequestParam("userId")String userId, @RequestParam("score")Float score);

    @GetMapping("/getMovieAndReviewsByUserIdReviewScoreLessThan")
    public String getMovieAndReviewsByUserIdReviewScoreLessThan(@RequestParam("userId")String userId, @RequestParam("score")Float score);

    @GetMapping("/getMovieAndReviewsByUserNameReviewScoreGreaterThanEqual")
    public String getMovieAndReviewsByUserNameReviewScoreGreaterThanEqual(@RequestParam("userName")String userName, @RequestParam("score")Float score);

    @GetMapping("/getMovieAndReviewsByUserNameReviewScoreLessThan")
    public String getMovieAndReviewsByUserNameReviewScoreLessThan(@RequestParam("userName")String userName, @RequestParam("score")Float score);

    @GetMapping("/getMovieAndReviewsByUserNameReviewScoreLessThanEqual")
    public String getMovieAndReviewsByUserNameReviewScoreLessThanEqual(@RequestParam("userName")String userName, @RequestParam("score")Float score);

    @GetMapping("/test")
    public String test(@RequestParam Integer times) throws Exception;
}
