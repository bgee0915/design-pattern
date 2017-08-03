package com.design.adapter.advance.impl;

import com.design.adapter.advance.AdvanceMedia;

public class AVIPlayer implements AdvanceMedia{

	@Override
	public void playMP4(String fileName) {
		// do nothing
	}

	@Override
	public void playAVI(String fileName) {
		System.out.println("playing avi filename: " + fileName);
	}

}
