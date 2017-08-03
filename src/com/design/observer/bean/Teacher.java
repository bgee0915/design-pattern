package com.design.observer.bean;

import java.util.Vector;

/**
 * 对象实现类  teacher (被观察者)
 * @author lx
 *
 */
public class Teacher implements Subject{
	
	private String phone;
	private Vector<Observer> students;
	

	public Vector<Observer> getStudents() {
		return students;
	}

	public void setStudents(Vector<Observer> students) {
		this.students = students;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		noticeObserver();	//更改号码时 需要通知观察者
	}

	

	@Override
	public Subject addObserver(Observer observer) {
		students.add(observer);
		return this;
	}

	@Override
	public Subject removeObserver(Observer observer) {
		students.remove(observer);
		return this;
	}

	@Override
	public Subject noticeObserver() {
		for(Observer observer : students){
			observer.update();	// 观察者更新
		}
		return this;
	}

	@Override
	public String toString() {
		return "Teacher [phone=" + phone + "]";
	}
	
	

}
