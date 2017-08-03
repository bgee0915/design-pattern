package com.design.filter.pinterface;

import java.util.List;

import com.design.filter.po.Person;

public interface Filter {
	public List<Person> filter(List<Person> personList);
}
