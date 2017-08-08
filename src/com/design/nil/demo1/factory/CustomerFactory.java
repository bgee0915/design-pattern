package com.design.nil.demo1.factory;

import com.design.nil.demo1.customer.Customer;
import com.design.nil.demo1.customer.CustomerNull;
import com.design.nil.demo1.customer.CustomerTrue;

public class CustomerFactory {
	private static String customerArray[] = {"alan","bob","caven","davi"};
	
	public static Customer getName(String name) {
		for(int i=0; i<customerArray.length; i++) {
			if(customerArray[i].equalsIgnoreCase(name)) {
				return new CustomerTrue(name);
			}
		}
		return new CustomerNull();
	}
}
