package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Address;

public interface IAdressRepo extends JpaRepository<Address, Integer> {

}
