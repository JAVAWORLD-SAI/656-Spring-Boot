package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="LandLordinf_tab")
public class LandLordinf {
	
	@Id
	@GeneratedValue
	@Column(name="LandLord_id_col")
	private Integer id;
	
	@Column(name="LandLord_name_col")
	private String name;
	@Column(name="LandLord_email_col")
	private String email;
	@Column(name="LandLord_gender_col")
	private String gender;
	@Column(name="LandLord_eaddr_col")
	private String eaddr;
	
	@Column(name = "LandLord_accountNumber_col")
	private Integer AccountNumber;
	
	@Column(name = "LandLord_ifsc_col")
	private String Ifsccode;
	
	@Column(name = "LandLordrent_col")
	private Integer RestAmout;
	
	
	//@Column(name="LandLord_Bhk_col")
	//private String BHKTYPE;
	
	@Column(name = "LandLord_Number_col")
	private Integer LandlordNumber;
	
	@Column(name = "LandLord_Payrent_col")
	private String Payrent;

}