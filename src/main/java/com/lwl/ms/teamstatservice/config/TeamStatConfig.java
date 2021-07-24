package com.lwl.ms.teamstatservice.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Configurable
public class TeamStatConfig {

        @Bean
        public RestTemplate restTemplate(){
            return  new RestTemplate();
        }

}
