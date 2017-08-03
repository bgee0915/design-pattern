package com.design.filter.pinterface;

import java.util.List;

import com.design.filter.po.Person;

public class FilterAnd implements Filter{
	private Filter filterOne;
	private Filter filterTwo;
	
	public FilterAnd(Filter filterOne, Filter filterTwo) {
		this.filterOne = filterOne;
		this.filterTwo = filterTwo;
	}

	@Override
	public List<Person> filter(List<Person> personList) {
		return filterOne.filter(filterTwo.filter(personList));
	}

}
