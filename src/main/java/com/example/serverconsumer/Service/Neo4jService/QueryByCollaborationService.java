package com.example.serverconsumer.Service.Neo4jService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Neo4j-Service-Provider", url = "${feign.Neo4jUrl}/byCollaboration")
public interface QueryByCollaborationService {
    @GetMapping("/getActorsCollaborations")
     String getActorsCollaborations(@RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping("/getActorsCollaborationCount")
     String getActorsCollaborationCount(@RequestParam("actorName1")String actorName1, @RequestParam("actorName2")String actorName2);

    @GetMapping("/getDirectorActorCollaborationCount")
     String getDirectorActorCollaborationCount(@RequestParam("actorName")String actorName, @RequestParam("directorName")String directorName);

    @GetMapping("/getDirectorActorCollaborations")
     String getDirectorActorCollaborations(@RequestParam("startFrom")Integer startFrom, @RequestParam("limitation")Integer limitation);

    @GetMapping(path = "/test")
     String test(@RequestParam Integer times) throws Exception;

}
