package com.lwl.ms.teamstatservice.service;
import com.lwl.ms.teamstatservice.domain.Team;
import com.lwl.ms.teamstatservice.dto.TeamAmountDto;
import com.lwl.ms.teamstatservice.dto.TeamDetailsStatDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TeamStatServiceImpl implements  TeamStatService{

    private RestTemplate restTemplate;

    public TeamStatServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public List<TeamDetailsStatDto> getTeamStats() {
        ResponseEntity<List<Team>> responseTeam = restTemplate
                .exchange("http://localhost:8081/teams/api/teamdetails", HttpMethod.GET, null, new ParameterizedTypeReference<List<Team>>() {});
        List<Team> teams = responseTeam.getBody();
        log.info("Team count {}",teams.size());
        ResponseEntity<List<TeamAmountDto>> responseAmount = restTemplate
                .exchange("http://localhost:8082/players/api/v1/team/amount", HttpMethod.GET, null, new ParameterizedTypeReference<List<TeamAmountDto>>() {});
        List<TeamAmountDto> teamAount = responseAmount.getBody();
        log.info("TeamAmount count: {}",teamAount.size());
        List<TeamDetailsStatDto> list = new ArrayList<>();

        teamAount.stream().forEach(ele->{
            String teamName = "";
            Optional<String> optData = getTeamName(ele.getLabel(),teams);
            if(optData.isPresent()){
                teamName = optData.get();
            }
            TeamDetailsStatDto tdsd = TeamDetailsStatDto.builder()
                    .label(ele.getLabel())
                    .count(ele.getCount())
                    .totalAmount(ele.getAmount())
                    .teamName(teamName)
                    .build();
            log.info("Team details stat dto: {}",tdsd.getTeamName());
            list.add(tdsd);
        });
        log.info("Total {} teams found",list.size());
        return list;
    }
    private Optional<String> getTeamName(String label, List<Team> teams){
       return teams.stream().filter(t->t.getLabel().equalsIgnoreCase(label)).map(t->t.getName()).findFirst();
    }

}
