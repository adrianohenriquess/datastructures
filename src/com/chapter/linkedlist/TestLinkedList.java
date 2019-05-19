package com.chapter.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		SLinkedList listaEncadeada = new SLinkedList();
		Node node = new Node();
		node.setElement("Adriano");
		listaEncadeada.addFirst(node);
		
		Node node2 = new Node();
		node2.setElement("Camila");
		listaEncadeada.addFirst(node2);
		
		Node node3 = new Node();
		node3.setElement("Fernerman");
		listaEncadeada.addLast(node3);
		
		listaEncadeada.removeFirst();
		
		System.out.println(listaEncadeada.toString());
	}

}
