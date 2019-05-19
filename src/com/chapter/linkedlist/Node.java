package com.chapter.linkedlist;

public class Node {
	private String element;
	private Node next;
	
	public Node() {}

	public Node(String s, Node n) {
		element = s;
		next = n;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
