package com.example.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Address")
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name = " ID")
	private Integer AddressId;
	private String Name;
	private Integer PhoNumber;
	private Integer pincode;
	private String Address;
	private String landmark;
	@ElementCollection
	private List<String> State;
	private String AddressType;
	

}
