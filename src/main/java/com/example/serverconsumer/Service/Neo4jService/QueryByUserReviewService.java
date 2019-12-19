package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}")
public interface QueryByUserReviewService {
    @GetMapping("/byUserReview/getMovieAndReviewsByUserIdScoreGreaterThan")
    public String getMovieAndReviewsByUserIdScoreGreaterThan(@RequestParam("userId")String userId, @RequestParam("score")Float score);

    @GetMapping("/byUserReview/getMovieAndReviewsByUserIdReviewScoreGreaterThanEqual")
    public String getMovieAndReviewsByUserIdReviewScoreGreaterThanEqual(@RequestParam("userId")String userId, @RequestParam("score")Float score);

    @GetMapping("/byUserReview/getMovieAndReviewsByUserIdReviewScoreLessThan")
    public String getMovieAndReviewsByUserIdReviewScoreLessThan(@RequestParam("userId")String userId, @RequestParam("score")Float score);

    @GetMapping("/byUserReview/getMovieAndReviewsByUserNameReviewScoreGreaterThanEqual")
    public String getMovieAndReviewsByUserNameReviewScoreGreaterThanEqual(@RequestParam("userName")String userName, @RequestParam("score")Float score);

    @GetMapping("/byUserReview/getMovieAndReviewsByUserNameReviewScoreLessThan")
    public String getMovieAndReviewsByUserNameReviewScoreLessThan(@RequestParam("userName")String userName, @RequestParam("score")Float score);

    @GetMapping("/byUserReview/getMovieAndReviewsByUserNameReviewScoreLessThanEqual")
    public String getMovieAndReviewsByUserNameReviewScoreLessThanEqual(@RequestParam("userName")String userName, @RequestParam("score")Float score);

    @GetMapping("/byUserReview/test")
    public String test(@RequestParam Integer times) throws Exception;
}
