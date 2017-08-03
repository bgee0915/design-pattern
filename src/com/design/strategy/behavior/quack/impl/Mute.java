package com.design.strategy.behavior.quack.impl;

import com.design.strategy.behavior.quack.QuackBehavior;

public class Mute implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("mute | quack | 吱吱吱吱吱吱吱");
	}

}
