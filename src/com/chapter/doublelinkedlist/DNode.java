package com.chapter.doublelinkedlist;

public class DNode {
	protected String element;
	protected DNode next, prev;

	public DNode() {
	}
	
	public DNode(String e) {
		element = e;
	}

	public DNode(String e, DNode p, DNode n) {
		element = e;
		prev = p;
		next = n;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}
}
