package com.lwl.ms.teamstatservice.service;

import com.lwl.ms.teamstatservice.dto.TeamRoleStatDto;
import com.lwl.ms.teamstatservice.dto.TeamStatDto;

import java.util.List;

public interface TeamStatService {

            public List<TeamStatDto> getTeamStats();
            public TeamRoleStatDto getTeamRoleStats(String label);
}
