package com.example.serverconsumer.Controller.Neo4jControllers;

import com.example.serverconsumer.Service.Neo4jService.QueryByCollaborationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "按照合作关系查询（Neo4j）")
@RequestMapping("/neo4j/byCollaboration")
public class QueryByCollaborationController {
    @Resource
    private QueryByCollaborationService queryByCollaborationService;

    @ApiOperation("根据演员与演员合作关系查询")
    @GetMapping("/getActorsCollaborations")
    public String getActorsCollaborations(@RequestParam("startFrom")Integer startFrom,
                                          @RequestParam("limitation")Integer limitation){
        return queryByCollaborationService.getActorsCollaborations(startFrom,limitation);
    }

    @ApiOperation("查询演员之间合作次数")
    @GetMapping("/getActorsCollaborationCount")
    public String getActorsCollaborationCount(@RequestParam("actorName1")String actorName1,
                                              @RequestParam("actorName2")String actorName2){
        return queryByCollaborationService.getActorsCollaborationCount(actorName1,actorName2);
    }

    @ApiOperation("查询演员，导演合作次数")
    @GetMapping("/getDirectorActorCollaborationCount")
    public String getDirectorActorCollaborationCount(@RequestParam("actorName")String actorName,
                                                     @RequestParam("directorName")String directorName){
        return queryByCollaborationService.getDirectorActorCollaborationCount(actorName,directorName);
    }

    @ApiOperation(value = "根据导演与演员合作关系查询")
    @GetMapping("/getDirectorActorCollaborations")
    public String getDirectorActorCollaborations(@RequestParam("startFrom")Integer startFrom,
                                                 @RequestParam("limitation")Integer limitation){
        return queryByCollaborationService.getDirectorActorCollaborations(startFrom,limitation);
    }

    @ApiOperation("测试")
    @GetMapping(path = "/test")
    public String test(@RequestParam Integer times) throws Exception{
        return queryByCollaborationService.test(times);
    }
}
