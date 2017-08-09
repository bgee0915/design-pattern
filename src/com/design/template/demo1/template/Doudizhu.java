package com.design.template.demo1.template;

public class Doudizhu extends Game{

	@Override
	void initGame() {
		System.out.println("斗地主 洗牌  开始");
	}

	@Override
	void start() {
		System.out.println("斗地主: 叫地主   抢地主   我抢！  我抢！！");
	}

	@Override
	void end() {
		System.out.println("斗地主： 破游戏， 毁我青春害我钱财");
	}

}
