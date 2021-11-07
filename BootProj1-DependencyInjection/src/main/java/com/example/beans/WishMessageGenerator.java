package com.example.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@SuppressWarnings("unused")
	@Autowired
	private LocalDateTime date;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator -- 0 param constructor");
	}
	
	// bussiness logic
	public String generateWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//get current hour of the day
		int hour=date.getHour();
		if (hour<12) 
			return "GOOD MORNING ::  " +user;
		else if (hour<16)
			return "GOOD AFTERNOON ::  "+ user;
		else if(hour<20)
			return "GOOD EVENING ::  "+ user;
		else 
			return ":: PERSON DEAD :: "+ user ;
	}
}
