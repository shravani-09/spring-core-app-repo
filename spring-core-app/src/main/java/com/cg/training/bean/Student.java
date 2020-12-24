package com.cg.training.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Long admissionNumber;
	private String studentName;
	
	
	
	public void initializeStudent() {
		System.out.println("Custom init method invoked");
	}
	
	
	public void destroyStudent() {
		System.out.println("Student object destroyed");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Invoked through postConstruct annotation");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Invoked through preDestroy annotation");
	}
}
