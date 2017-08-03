package com.design.iterator.pinterface;


/**
 * 迭代器
 * @author lx
 *
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * 下一个元素
	 * @return
	 */
	T next();
	
	/**
	 * 是否有下一个元素
	 * @return
	 */
	boolean hasNext();

}
