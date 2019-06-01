package com.chapter.linkedlist;

public class SLinkedList {
	protected Node head; // no da cabeça da lista

	protected Node tail;// no da cauda da lista

	protected long size; // numero de nos da lista

	public SLinkedList() {
		head = null;
		size = 0;
	}

	public void addFirst(Node v) {
		v.setNext(head);
		head = v;
		tail = v.getNext();
		size++;
	}

	public void addLast(Node v) {
		v.setNext(null);
		tail.setNext(v);
		tail = v;
		size++;
	}

	public void removeFirst() {
		Node f = head;
		if (f == null) {
			throw new UnsupportedOperationException("A lista está vazia");
		}

		head = head.getNext();
		f.setNext(null);
		size--;
	}

	public Node getPenult() {
		for (Node x = head; x != null; x = x.getNext()) {
			if (x.getNext().getNext() == null) {
				return x;
			}
		}
		return null;
	}
}
