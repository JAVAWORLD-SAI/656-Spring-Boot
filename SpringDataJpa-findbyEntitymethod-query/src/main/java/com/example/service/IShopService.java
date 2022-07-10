package com.example.service;

import java.util.List;

import com.example.Model.Shops;

public interface IShopService {

			public List<Shops> fetchshopsbyname(String shopname);
			
			public List<Shops>fetchcompanyAddress(String shopArea);
			
			//public List<Shops>fetchcompanyid(Integer shopid);
}

