package com.design.command.demo1.command;

import com.design.command.demo1.receiver.Stock;

public class BuyStock implements Order{
	Stock stock;
	
	public BuyStock(Stock stock){
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}
	
	
}
