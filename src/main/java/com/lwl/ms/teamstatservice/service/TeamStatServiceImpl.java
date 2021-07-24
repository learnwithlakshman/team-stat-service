package com.lwl.ms.teamstatservice.service;

import com.lwl.ms.teamstatservice.dto.TeamRoleStatDto;
import com.lwl.ms.teamstatservice.dto.TeamStatDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TeamStatServiceImpl implements  TeamStatService{


    private RestTemplate restTemplate;

    public TeamStatServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public List<TeamStatDto> getTeamStats() {
        return null;
    }
    @Override
    public TeamRoleStatDto getTeamRoleStats(String label) {
        return null;
    }
}
