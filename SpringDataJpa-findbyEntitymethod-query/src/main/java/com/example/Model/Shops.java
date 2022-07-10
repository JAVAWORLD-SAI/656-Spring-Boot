package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Shops")
public class Shops {

	@Id
	@GeneratedValue
	private Integer shopid;
	private String shopname;
	private String shopArea;
	
}
