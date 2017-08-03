package com.design.component;

public class ImageFile extends AbstractFile{
	
	private String name;
	
	public ImageFile(String name){
		this.name = name;
	}
	

	@Override
	public void add(AbstractFile file) {
		System.out.println("不支持");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("不支持");
		
	}

	@Override
	public AbstractFile getChild(int index) {
		System.out.println("不支持");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("对图片文件： " + this.name + " 进行杀毒");
	}

}
