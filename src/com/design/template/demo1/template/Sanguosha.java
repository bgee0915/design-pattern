package com.design.template.demo1.template;

public class Sanguosha extends Game{

	@Override
	void initGame() {
		System.out.println("三国杀： 洗牌开始");
	}

	@Override
	void start() {
		System.out.println("三国杀： 烽火狼烟 , 杀  杀 杀  啊 杀");
	}

	@Override
	void end() {
		System.out.println("三国杀： 破游戏 ， 毁我青春害我钱财");
	}
	
}
