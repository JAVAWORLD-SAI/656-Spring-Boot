package com.example.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Shops;
import com.example.repo.IShoprepo;
import com.example.service.IShopService;

@Service("shopsmgntservice")
public class Shopimplementation  implements IShopService{
	
	@Autowired
	private IShoprepo repo;

	/*
	@Override
	public List<Shops> fetchcompanyid(Integer shopid) {
		// TODO Auto-generated method stub
		return repo.findbyshopid(shopid);
	}
	*/
	@Override
	public List<Shops> fetchshopsbyname(String shopname) {
		// TODO Auto-generated method stub
		return repo.findByShopname(shopname);
	}
	@Override
	public List<Shops> fetchcompanyAddress(String shopArea) {
		// TODO Auto-generated method stub
		return repo.findbyAdress(shopArea);
	}

}
