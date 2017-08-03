package com.design.adapter.audit.impl;

import com.design.adapter.adapter.AdapterMedia;
import com.design.adapter.audit.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void play(String fileName, String fileType) {
		if("mp3".equals(fileType)){
			System.out.println("playing mp3 filename: " + fileName);
		}else if("mp4".equals(fileType) || "avi".equals(fileType)){
			AdapterMedia am = new AdapterMedia(fileType);
			am.play(fileName, fileType);
		}else{
			System.out.println("type error");
		}
	}

}
