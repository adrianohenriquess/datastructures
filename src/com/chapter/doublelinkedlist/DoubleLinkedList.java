package com.chapter.doublelinkedlist;

public class DoubleLinkedList {
	
	private DNode header, trailer;
		
	private int size;
	
	public DoubleLinkedList() {
		header  = new DNode();
		trailer = new DNode(null, header, null);
		header.setNext(trailer);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public DNode getFirst() throws IllegalStateException {
		if (isEmpty())
			throw new IllegalStateException("Lista está vazia");
		return header.getNext();
	}

	public DNode getLast() throws IllegalStateException {
		if (isEmpty())
			throw new IllegalStateException("Lista está vazia");
		return trailer.getPrev();
	}
	
	public DNode getPrev(DNode v) {
		if (v == header) throw new IllegalArgumentException("não pode voltar para trás do cabeçalho da lista");
		return v.getPrev();
	}
	
	public DNode getNext(DNode v) {
		if (v == trailer) throw new IllegalArgumentException("não pode avançar além do trailer da lista");
		return v.getNext();
	}
	
	/**
	 * 1º pega o prev de c
	 *  
	 * [Cabeça] --> ["A"]--> ["C"]--> ["D"]--> [Cauda]
	 * 
	 * 2º então variavel u recebe nó ["A"]
	 * 
	 * [Cabeça] --> ["A"]--> ["C"] --> ["D"]--> [Cauda]
	 * 
	 * 3º z é igual a ["B"] e o prev é ["A"]
	 * 
	 * [Cabeça] --> ["A"]--> ["B"] --> ["C"]--> ["D"]--> [Cauda]
	 * 
	 * @param v
	 * @param z
	 */
	public void addBefore(DNode v, DNode z) {
		DNode u = getPrev(v);
		z.setPrev(u);
		z.setNext(v);
		v.setPrev(z);
		u.setNext(z);
		size++;
	}
	
	public void addAfter(DNode v, DNode z) {
		DNode w = getNext(v);
		z.setPrev(v);
		z.setNext(w);
		w.setPrev(z);
		v.setNext(z);
		size++;
	}
	
	public void addFirst(DNode v) {
		addAfter(header, v);
	}
	
	public void addLast(DNode v) {
		addBefore(trailer, v);
	}
	
	public void remove(DNode v) {
		DNode u = getPrev(v);
		DNode w = getNext(v);
		w.setPrev(u);
		u.setNext(w);
		v.setPrev(null);
		v.setNext(null);
		size--;
	}
	
	public boolean hasPrev(DNode v) {
		return v != header;
	}
	
	public boolean hasNext(DNode v) {
		return v != trailer;
	}
	
	public String toString() {
		String s = "[H] -->[";
		DNode v = header.getNext();
		while (hasNext(v)) {
			s += v.getElement();
			v = v.getNext();
			if (hasNext(v))
				s += ",";
		}
		s += "] -->[T]";
		return s;
	}
	
	public DNode getTrailer() {
		return trailer;
	}
	
	public DNode getHeader() {
		return header;
	}
}
