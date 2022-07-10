package com.example.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Address;
import com.example.repo.IAdressRepo;
import com.example.service.IAddressService;

@Service
public class AddressImplementation implements IAddressService {

	@Autowired
	private IAdressRepo repo;
	
	@Override
	public Integer saveAdress(Address id) {
		
		return repo.save(id).getAddressId();
	}

}
