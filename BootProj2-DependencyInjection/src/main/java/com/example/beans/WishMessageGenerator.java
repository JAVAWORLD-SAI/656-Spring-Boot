package com.example.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("wmg")
@Data
public class WishMessageGenerator {

	@Autowired
	@Qualifier("ldt")
	private LocalDateTime date;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0 param Constructor");
						
		}
	
	public String generateWishMessge(String user) {
		System.out.println("WishMessageGenerator.generateWishMessge()");
		int hour=date.getHour();
		if(hour<12)
			return "GOOD MORNING :: "+user;
		else if(hour<16)
			return "GOOD AFTERNOON :: "+ user;
		else if(hour<20)
			return "GOOD EVENING :: "+user;
		else
		return "DODY DEAD ::"+user;
		
	}
	
	}
