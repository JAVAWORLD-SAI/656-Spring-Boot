package com.example.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Corona_Vaccine_4")
public class CoronaVaccine implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// @id it generates the primaryKey Value
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer RegNo;
	private String   FullName;
	private String CompanyName;
	private Integer Dose;
	private Double Cost;

}
