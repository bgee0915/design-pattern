package com.design.filter.pinterface;

import java.util.ArrayList;
import java.util.List;

import com.design.filter.po.Person;

public class FilterWoman implements Filter{

	@Override
	public List<Person> filter(List<Person> personList) {
		List<Person> list = new ArrayList<Person>();
		for(Person person : personList) {
			if("woman".equalsIgnoreCase(person.getSex())) {
				list.add(person);
			}
		}
		return list;
	}

}
