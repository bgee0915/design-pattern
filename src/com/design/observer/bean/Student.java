package com.design.observer.bean;


/**
 * 观察者实现类 student
 * @author lx
 *
 */
public class Student implements Observer{
	
	private String name;

	private String tPhone;
	private Teacher teacher;
	
	
	

	public String getName() {
		return name;
	}
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String gettPhone() {
		return tPhone;
	}




	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}




	public Teacher getTeacher() {
		return teacher;
	}




	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}




	@Override
	public Observer update() {
		this.tPhone = teacher.getPhone();
		return this;
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", tPhone=" + tPhone + ", teacher=" + teacher + "]";
	}




	
	

}
