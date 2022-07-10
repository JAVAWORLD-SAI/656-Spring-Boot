package com.example.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_tab")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="emp_id_col")
	private Integer id;
	
	@Column(name="emp_ename_col")
	private String ename;
	@Column(name="emp_email_col")
	private String email;
	@Column(name="emp_gender_col")
	private String gender;
	@Column(name="emp_eaddr_col")
	private String eaddr;
	
	@ElementCollection
	@CollectionTable(name="emp_prjs_tab",
	joinColumns = @JoinColumn(name="emp_id_col"))
	@Column(name="emp_prjs_col")
	private List<String> prjs;
/**	
	@ElementCollection
	@CollectionTable(name="emp_slots_tab",
	joinColumns = @JoinColumn(name="emp_id_col"))
	@Column(name="emp_slots_col")
	private List<String> slots;
**/
}
	

