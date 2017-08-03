package com.design.command.demo1.test;

import com.design.command.demo1.command.BuyStock;
import com.design.command.demo1.command.SellStock;
import com.design.command.demo1.invoker.Broker;
import com.design.command.demo1.receiver.Stock;

public class Test {
	public static void main(String[] args) {
		Stock stock = new Stock();
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		
		new Broker().addOrder(buyStock).addOrder(sellStock).execute();
	}
}
