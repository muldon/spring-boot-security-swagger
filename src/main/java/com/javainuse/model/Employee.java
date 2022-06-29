package com.javainuse.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {
	@EqualsAndHashCode.Include
	private String empId;
	private String name;
	private String designation;
	private double salary;

	 

}