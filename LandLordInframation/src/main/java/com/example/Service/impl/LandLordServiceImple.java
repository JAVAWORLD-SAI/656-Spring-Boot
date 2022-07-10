package com.example.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Service.ILandlordService;
import com.example.model.LandLordinf;
import com.example.repo.ILandlordrepo;

@Service
public class LandLordServiceImple implements ILandlordService {
	
	@Autowired
	private ILandlordrepo repo;

	@Override
	public Integer saveLandLord(LandLordinf l) {
		
		l=repo.save(l);
		return  l.getId();
		
	}
	@Override
	public Integer getAllData() {
		
		return null;
	}

}
