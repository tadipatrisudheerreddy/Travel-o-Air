package com.mytravel.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@JsonPropertyOrder({"price","destination","origin","service_provider","alliance"})
@Builder
public class TripPlan {
	
	@JsonProperty("Price")
	int price;
	
	@JsonProperty("Destination")
	String destination;
	
	@JsonProperty("Origin")
	String origin;
	
	@JsonProperty("ServiceProvider")
	String serviceProvider;
	
	@JsonProperty("Alliance")
	String alliance;
	
	
}
