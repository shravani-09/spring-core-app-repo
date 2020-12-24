package com.cg.training.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Address {
	private Integer plotNumber;
	private String streetName;
	private String city;
	private String state;
	private Long pinCode;
	
	
	
	
}
