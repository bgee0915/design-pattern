package com.design.iterator.pinterface.impl;

import com.design.iterator.bean.Node;
import com.design.iterator.pinterface.Iterator;
import com.design.iterator.pinterface.List;

public class LinkedList<T> implements List<T> {
	
	/** 头结点 */
	private Node<T> head = null;
	/** 尾结点 */
	private Node<T> tail = null;
	/** length */
	private int size = 0;
	
	
	@Override
	public void add(T t) {
		size++;
		Node<T> node = new Node<T>(t,null);
		if(null == head){
			head = node;
			tail = node;
			node.setNext(null);
			return;
		}
		tail.setNext(node);
		tail = node;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void remove(T t) {
		
	}

	@Override
	public T get(int size) {
		if(null == head){
			return null;
		}
		if(0 > size || this.size <= size){
			return null;
		}
		if(0 == size){
			return head.getNode();
		}
		if(this.size - 1 == size){
			return tail.getNode();
		}
		
		Node<T> target = head;
		for(int i=0; i<size; i++){
			target = target.getNext();
		}
		
		return target.getNode();
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>();
	}
	
	private class LinkedListIterator<E> implements Iterator<E>{
		private Node<T> currentIndex = head ;

		@Override
		@SuppressWarnings("unchecked")
		public E next() {
			Node<T> node = currentIndex;
			currentIndex = node.getNext();
			return (E)node.getNode();
		}

		@Override
		public boolean hasNext() {
			return currentIndex != null;
		}
		
	}

}
