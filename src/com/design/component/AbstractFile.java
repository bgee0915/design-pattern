package com.design.component;

/**
 * 顶级抽象类
 * @author lx 
 *
 */
public abstract class AbstractFile {
	
	/**
	 * 添加
	 * @param file
	 */
	public abstract void add(AbstractFile file);
	
	/**
	 * 删除
	 * @param file
	 */
	public abstract void remove(AbstractFile file);
	
	/**
	 * 获取儿子对象
	 * @param index
	 * @return
	 */
	public abstract AbstractFile getChild(int index);
	
	/**
	 * 杀毒
	 */
	public abstract void killVirus();
	
	
}
