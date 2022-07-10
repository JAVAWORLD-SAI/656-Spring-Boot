package com.example.Model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StudentRegistration {
	@Id
	@GeneratedValue
	private Integer stdId;
	private String stdName;
	private String stdGen;
	private Double stdFee;
	private String stdCourse;
	@ElementCollection
	private List<String> stdSlot;
	private String stdAddr;
}

