package com.design.adapter.advance.impl;

import com.design.adapter.advance.AdvanceMedia;

public class MP4Player implements AdvanceMedia{

	@Override
	public void playMP4(String fileName) {
		System.out.println("playing MP4 filename: " + fileName);		
	}

	@Override
	public void playAVI(String fileName) {
		// TODO do nothing
		
	}

}
