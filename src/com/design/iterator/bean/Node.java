package com.design.iterator.bean;

/**
 * 链表实体类
 * @author lx
 *
 * @param <T>
 */
public class Node<T> {
	/**
	 * 链表本身
	 */
	private T node;
	
	/**
	 * 链表下一个元素
	 */
	private Node<T> next;
	
	public Node(T node, Node<T> next){
		this.node = node;
		this.next = next;
	}

	public T getNode() {
		return node;
	}

	public void setNode(T node) {
		this.node = node;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	 
	
	
}
