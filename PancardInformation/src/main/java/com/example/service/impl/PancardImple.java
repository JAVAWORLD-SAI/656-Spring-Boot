package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Pancard;
import com.example.repo.PancardRepo;
import com.example.service.PancardService;

@Service
public class PancardImple implements PancardService {

	
	@Autowired
	private PancardRepo repo;
	
	@Override
	public Integer savepancard(Pancard pan) {
		pan=repo.save(pan);
		return pan.getPancardId();
	}

}
