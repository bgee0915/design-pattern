package com.design.adapter.test;

import com.design.adapter.audit.MediaPlayer;
import com.design.adapter.audit.impl.AudioPlayer;

public class Test {
	public static void main(String[] args){
		MediaPlayer mp = new AudioPlayer();
		mp.play("哈哈哈哈.mp3","mp3");
		mp.play("呵呵呵呵.mp4", "mp4");
		mp.play("aaaaa.avi", "avi");
	}
}
