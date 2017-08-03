package com.design.filter.test;

import java.util.ArrayList;
import java.util.List;

import com.design.filter.pinterface.FilterAnd;
import com.design.filter.pinterface.FilterMan;
import com.design.filter.pinterface.FilterOr;
import com.design.filter.pinterface.FilterSingle;
import com.design.filter.po.Person;

public class Test {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("a","man",true));
		personList.add(new Person("b","woman",false));
		personList.add(new Person("c","man",false));
		personList.add(new Person("d","man",false));
		personList.add(new Person("e","man",false));
		personList.add(new Person("f","woman",true));
		personList.add(new Person("g","man",false));
		personList.add(new Person("h","man",true));
		personList.add(new Person("i","man",false));
		personList.add(new Person("j","man",true));
		personList.add(new Person("k","woman",false));
		personList.add(new Person("l","man",true));
		personList.add(new Person("m","woman",true));
		personList.add(new Person("n","man",true));
		personList.add(new Person("o","woman",false));
		personList.add(new Person("P","man",true));
		personList.add(new Person("q","woman",false));
		personList.add(new Person("r","woman",true));
		personList.add(new Person("s","woman",true));
		personList.add(new Person("t","man",true));
		
		
		List<Person> manList = new FilterMan().filter(personList);
		printL(manList);
		
		List<Person> singleList = new FilterSingle().filter(personList);
		printL(singleList);
		
		List<Person> filterAndList = new FilterAnd(new FilterMan(),new FilterSingle()).filter(personList);
		printL(filterAndList);
		
		List<Person> filterOrList = new FilterOr(new FilterMan(),new FilterSingle()).filter(personList);
		printL(filterOrList);
		
	}
	
	public static void printL(List<Person> list) {
		for(Person person : list) {
			System.out.println(person);
		}
		System.out.println();
	}
}
