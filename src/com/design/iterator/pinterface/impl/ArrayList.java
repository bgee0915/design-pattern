package com.design.iterator.pinterface.impl;

import java.util.Arrays;

import com.design.iterator.pinterface.Iterator;
import com.design.iterator.pinterface.List;

public class ArrayList<T> implements List<T>{
	
	
//	实现list的数组
	private Object[] elementData ;

//	长度
	private int size;
	
	
	ArrayList(int size){
		elementData = new Object[size];
		size = 0;
	}
	
	public ArrayList(){
		this(10);
	}
	
	@Override
	public void add(T t) {
		
		if(size >= elementData.length){
			elementData = Arrays.copyOf(elementData, size * 2);
		}
		
		elementData[size++] = t;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void remove(T t) {
		//TODO 待完善
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayListIterator();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if(0 > index || size <= index){
			return null;
		}
		return (T)elementData[index];
	}
	
	private class ArrayListIterator implements Iterator<T>{
		private int currentIndex = 0;
		
		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			return (T)elementData[currentIndex++];
		}

		@Override
		public boolean hasNext() {
			return currentIndex < size;
		}
		
	}


}
