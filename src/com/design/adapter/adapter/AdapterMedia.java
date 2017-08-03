package com.design.adapter.adapter;

import com.design.adapter.advance.AdvanceMedia;
import com.design.adapter.advance.impl.AVIPlayer;
import com.design.adapter.advance.impl.MP4Player;
import com.design.adapter.audit.MediaPlayer;

public class AdapterMedia implements MediaPlayer{

	AdvanceMedia advanceMedia; 
	 
	
	public AdapterMedia(String fileName){
		if("mp4".equals(fileName)){
			advanceMedia = new MP4Player();
		}
		if("avi".equals(fileName)){
			advanceMedia = new AVIPlayer();
		}
	}
	
	@Override
	public void play(String fileName, String fileType) {
		if("mp4".equals(fileType)){
			advanceMedia.playMP4(fileName);
		}
		if("avi".equals(fileType)){
			advanceMedia.playAVI(fileName);
		}
	}

}
