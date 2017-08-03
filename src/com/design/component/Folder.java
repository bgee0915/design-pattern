package com.design.component;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
	
	private String name;
	public Folder(String name){
		this.name  = name;
	}
	List<AbstractFile> folderList = new ArrayList<AbstractFile>();
	

	@Override
	public void add(AbstractFile file) {
		 folderList.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		folderList.remove(file);
	}

	@Override
	public AbstractFile getChild(int index) {
		return folderList.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("对文件夹：  " + this.name + " 进行杀毒!");
		for(AbstractFile af : folderList){
			af.killVirus();
		}
	}



}
