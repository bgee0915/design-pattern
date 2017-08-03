package com.design.command.demo1.receiver;

public class Stock {
	private String name = "货物";
	private int quantity = 10;
	
	public void sell() {
		System.out.println("sell : name=" + name + ",  quantity=" + quantity);
	}
	
	public void buy() {
		System.out.println("buy : name=" + name + ", quantity=" + quantity);
	}
	
}
