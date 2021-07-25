package com.lwl.ms.teamstatservice.dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamAmountDto {
	private String label;
	private int count;
	private double amount;
}
