package com.example.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("info")
@Data
@ConfigurationProperties(prefix = "org.com")
public class ItemsInfo {
		
	private float idlyprice;
	private float dosaprice;
	private float pooriprice;

}
