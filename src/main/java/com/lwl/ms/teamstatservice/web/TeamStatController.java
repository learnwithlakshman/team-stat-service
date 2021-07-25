package com.lwl.ms.teamstatservice.web;
import com.lwl.ms.teamstatservice.dto.TeamDetailsStatDto;
import com.lwl.ms.teamstatservice.service.TeamStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeamStatController {
        @Autowired
        private TeamStatService teamStatService;


        @GetMapping("/teamdetails")
        public List<TeamDetailsStatDto> getTeamDetailsStat(){
            return teamStatService.getTeamStats();
        }
}
