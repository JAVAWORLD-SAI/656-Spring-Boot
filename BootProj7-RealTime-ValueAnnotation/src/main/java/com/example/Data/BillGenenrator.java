package com.example.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("Bill")
public class BillGenenrator {
	
	@Value("#{info.idlyprice+info.dosaprice+info.pooriprice}")
	private float total;
	
	@Value("BBK")
	private String HotelName;
	
	@Autowired
	private ItemsInfo items;

}
