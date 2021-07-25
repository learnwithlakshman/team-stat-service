package com.lwl.ms.teamstatservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamDetailsStatDto {
        private String label;
        private String teamName;
        private int count;
        private double totalAmount;
}
