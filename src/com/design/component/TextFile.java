package com.design.component;

public class TextFile extends AbstractFile{
	
	private String name;
	
	public TextFile(String name){
		this.name = name;
	}
	

	@Override
	public void add(AbstractFile file) {
		System.out.println("文本文件不支持添加功能 ");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("文本文件不支持删除功能 ");
		
	}

	@Override
	public AbstractFile getChild(int index) {
		System.out.println("文本文件不支持获取下级目标功能");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("对文本文件:" + name + "  进行杀毒");
	}

}
