package com.psl.entity;

import javax.validation.constraints.Size;

public class Employee {
	
	private int id;
	@Size(min=5, max=10, message="name should be 5 to 10 char long")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
