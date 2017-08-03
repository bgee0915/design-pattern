package com.design.iterator.test;

import com.design.iterator.pinterface.Iterator;
import com.design.iterator.pinterface.List;
import com.design.iterator.pinterface.impl.ArrayList;
import com.design.iterator.pinterface.impl.LinkedList;

public class Test {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		for(int i=0; i<15; i++){
			list.add("list("+i+") = " + i);
		}
		
		Iterator<String> listIter = list.iterator();
		
		while(listIter.hasNext()){
			System.out.println(listIter.next());
		}
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(10));
		System.out.println(list.get(14));
//		====================================================
		
		
		List<String> link = new LinkedList<String>();
		for(int i=0; i<15; i++){
			link.add("link("+i+") = " + i*2);
		}
		
		Iterator<String> linkIter = link.iterator();
		while(linkIter.hasNext()){
			System.out.println(linkIter.next() );
		}
		
		System.out.println(link.get(0));
		System.out.println(link.get(10));
		System.out.println(link.get(14));
	}
}
