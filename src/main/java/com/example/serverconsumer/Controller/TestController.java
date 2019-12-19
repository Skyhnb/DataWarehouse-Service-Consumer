package com.example.serverconsumer.Controller;

import com.example.serverconsumer.Service.Neo4jTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private Neo4jTest neo4jTest;

    @GetMapping("/Neo4j")
    public String test(){
        return neo4jTest.test();
    }
}
