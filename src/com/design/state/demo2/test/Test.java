package com.design.state.demo2.test;

import com.design.state.demo2.context.Context;
import com.design.state.demo2.state.IceWater;
import com.design.state.demo2.state.WarmWater;
import com.design.state.demo2.state.Water;

public class Test {
	public static void main(String[] args) {
		String waterTemp = "";
		Context context = new Context();
		Water iceWater = new IceWater();
		waterTemp = iceWater.temperature(context).getWater().waterState();
		System.out.println("context.water ==== " + waterTemp);
		
		Water warmWater = new WarmWater();
		waterTemp = warmWater.temperature(context).getWater().waterState();
		System.out.println("context.water ==== " + waterTemp);
		
		
		
	}
}
