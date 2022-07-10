package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Shops;

public interface IShoprepo extends JpaRepository<Shops, Integer> {
	
	//select shopid,shopname,shopArea from Shops where shopname=?
    public  List<Shops> findByShopname(String shopname);
    
    //select shopid,shopname,shopArea from Shops where  shopArea=?
    public List<Shops> findbyAdress(String shopArea);
    
    //select shopid,shopname,shopcompanyName from shops where shopid=?
   // public List<Shops> findbyshopid(Integer shopid);
    
    
    // out put 
    // Hibernate: select shops0_.shopid as shopid1_0_, shops0_.shop_area as shop_are2_0_, shops0_.shopname as shopname3_0_ from shops shops0_ where shops0_.shopname=?

}
