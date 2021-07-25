package com.lwl.ms.teamstatservice.service;

import com.lwl.ms.teamstatservice.dto.TeamDetailsStatDto;

import java.util.List;

public interface TeamStatService {
     public List<TeamDetailsStatDto> getTeamStats();
}