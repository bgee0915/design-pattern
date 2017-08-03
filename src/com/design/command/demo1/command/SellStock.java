package com.design.command.demo1.command;

import com.design.command.demo1.receiver.Stock;

public class SellStock implements Order{
	
	private Stock stock;
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}

}
