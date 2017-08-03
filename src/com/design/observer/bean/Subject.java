package com.design.observer.bean;

/**
 * 目标对象接口 subject (被观察者)
 * @author lx
 *
 */
public interface Subject {
	/**
	 * 添加观察者
	 * @param observer 观察者
	 * @return
	 */
	public Subject addObserver(Observer observer);
	
	/**
	 * 移除观察者
	 * @param observer
	 * @return
	 */
	public Subject removeObserver(Observer observer);
	
	/**
	 * 通知观察者
	 * @return
	 */
	public Subject noticeObserver();
}
