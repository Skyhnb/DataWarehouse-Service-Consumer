package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.IndicesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/neo4j/indices")
public class IndicesController {
    @Resource
    private IndicesService indicesService;

    @GetMapping("/deleteIndices")
    public String deleteIndices(){
        return indicesService.deleteIndices();
    }

    @GetMapping("/createIndices")
    public String createIndices(){
        return indicesService.createIndices();
    }
}
