package com.design.template.demo1.test;

import com.design.template.demo1.template.Doudizhu;
import com.design.template.demo1.template.Game;
import com.design.template.demo1.template.Sanguosha;

public class Test {
	public static void main(String[] args) {
		Game sanguosha = new Sanguosha();
		
		Game doudizhu = new Doudizhu();
		
		sanguosha.play();
		
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		
		doudizhu.play();
	}
}
