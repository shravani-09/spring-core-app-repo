package com.cg.training.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
	private Long adharCard;
	private String name;
	private Date birthdate;
	private Long mobile;
	private Address houseAddress;
}
