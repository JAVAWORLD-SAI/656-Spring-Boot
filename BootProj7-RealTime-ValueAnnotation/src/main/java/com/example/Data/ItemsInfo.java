package com.example.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("info")
@Data
@PropertySource("com/example/commons/inputs.properties")
public class ItemsInfo {
	
	@Value("${idly.price}")
	private float idlyprice;
	
	@Value("${dosa.price}")
	private float dosaprice;
	
	@Value("${poori.price}")
	private float pooriprice;

}
