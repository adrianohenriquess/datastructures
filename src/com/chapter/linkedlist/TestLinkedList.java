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
		node3.setElement("Cabron");
		listaEncadeada.addFirst(node3);
		
		Node node4 = new Node();
		node4.setElement("Fernerman");
		listaEncadeada.addFirst(node4);
		
		Node node5 = new Node();
		node5.setElement("Fernando");
		listaEncadeada.addFirst(node5);
		
		//listaEncadeada.removeFirst();
		
		System.out.println(listaEncadeada.toString());
		System.out.println(listaEncadeada.getPenult().getElement());
	}

}
