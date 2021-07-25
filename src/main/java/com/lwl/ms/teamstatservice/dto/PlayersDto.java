package com.lwl.ms.teamstatservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayersDto {
    private String name;
    private String role;
    private double amount;
    private String label;
}
