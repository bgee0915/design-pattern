package com.design.iterator.pinterface;

/**
 * 容器基类
 * @author lx
 *
 * @param <T>
 */
public interface Collection<T>{
	/**
	 * 添加
	 * @param t
	 */
	void add(T t);
	
	/**
	 * 返回大小
	 * @return
	 */
	int size();
	
	/**
	 * 删除
	 */
	void remove(T t);
	
	/**
	 * 获取T
	 * @param 位置
	 * @return
	 */
	T get(int size);
	
	/**
	 * 迭代
	 * @return
	 */
	Iterator<T> iterator();
	
	
	
}
