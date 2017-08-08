package com.design.nil.demo1.customer;

public class CustomerTrue implements Customer{

	private String name;
	
	public CustomerTrue(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
