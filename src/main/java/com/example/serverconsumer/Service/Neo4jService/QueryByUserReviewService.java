package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-QueryByUserReviewService",url = "${feign.Neo4jUrl}/byUserReview")
public interface QueryByUserReviewService {
    @GetMapping("/getMovieAndReviewsByUserNameReviewMood")
     String getMovieAndReviewsByUserNameReviewMood(@RequestParam("userId")String userId, @RequestParam("mood")String mood);

    @GetMapping("/getMovieAndReviewsByUserIdReviewMood")
     String getMovieAndReviewsByUserIdReviewMood(@RequestParam("userId")String userId, @RequestParam("mood")String mood);

    @GetMapping("/test")
     String test(@RequestParam Integer times);

    @GetMapping("/compareIndex")
     String compareIndex(@RequestParam Integer times) throws Exception;
}
