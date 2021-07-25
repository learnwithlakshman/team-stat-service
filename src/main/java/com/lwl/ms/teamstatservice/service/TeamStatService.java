package com.lwl.ms.teamstatservice.service;

import com.lwl.ms.teamstatservice.dto.PlayersDto;
import com.lwl.ms.teamstatservice.dto.TeamAmountDto;
import com.lwl.ms.teamstatservice.dto.TeamRoleStatDto;
import com.lwl.ms.teamstatservice.dto.TeamDetailsStatDto;

import java.util.List;

public interface TeamStatService {

             public List<TeamDetailsStatDto> getTeamStats();
             public List<TeamRoleStatDto> getRoleCountStat(String label);
             public List<TeamAmountDto> getRoleAmountStat(String label);
             public List<PlayersDto> getPlayers();
}
