package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PanCard_tab")
public class Pancard {

	@Id
	@GeneratedValue
	private Integer PancardId;
	private String Name;
	private String PancardNumber;

}
