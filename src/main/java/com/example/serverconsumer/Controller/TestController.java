package com.example.serverconsumer.Controller;

import com.example.serverconsumer.Service.Neo4jTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "测试")
@RequestMapping("测试")
public class TestController {
    @Resource
    private Neo4jTest neo4jTest;

    @ApiOperation("测试")
    @GetMapping("/Neo4j")
    public String test(){
        return neo4jTest.test();
    }
}
