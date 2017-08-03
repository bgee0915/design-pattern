package com.design.component;

public class Test {
	public static void main(String[] args){
		AbstractFile folder = new Folder("总文件夹");
		AbstractFile imageFolder = new Folder("图片文件夹");
		AbstractFile textFolder = new Folder("文本文件夹");
		
		AbstractFile imageFile = new ImageFile("图片1.jpg");
		AbstractFile imageFile2 = new ImageFile("图片2.png");
		AbstractFile textFile = new TextFile("文本1.txt");
		AbstractFile textFile2 = new TextFile("文本2.txt");
		
		folder.add(imageFolder);
		folder.add(textFolder);
		imageFolder.add(imageFile);
		imageFolder.add(imageFile2);
		textFolder.add(textFile);
		textFolder.add(textFile2);
		
		folder.killVirus();
		
	}
}
