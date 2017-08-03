package com.design.filter.po;

public class Person {
	private String name;
	private String sex;
	private boolean single;
	
	
	
	public Person(String name, String sex, boolean single) {
		super();
		this.name = name;
		this.sex = sex;
		this.single = single;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isSingle() {
		return single;
	}
	public void setSingle(boolean single) {
		this.single = single;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", single=" + single + "]";
	}
	
	
	
	
}
