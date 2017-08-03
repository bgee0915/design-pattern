package com.design.filter.pinterface;

import java.util.List;

import com.design.filter.po.Person;

public class FilterOr implements Filter{
	private Filter filterOne;
	private Filter filterTwo;
	
	public FilterOr (Filter filterOne, Filter filterTwo) {
		this.filterOne = filterOne;
		this.filterTwo = filterTwo;
	}

	@Override
	public List<Person> filter(List<Person> personList) {

		List<Person> listOne = filterOne.filter(personList);
		List<Person> listTwo = filterTwo.filter(personList);
		
		for(Person person: listTwo) {
			boolean f = listOne.contains(person) ? false : listOne.add(person);
			System.out.println(f);
		}
		
		return listOne;
	}

}
