package com.chapter.doublelinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleLinkedListTest {

	@Test
	public void testCriarDoubleLinkedList() throws Exception {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		assertNotNull(doubleLinkedList.getHeader());
		assertNotNull(doubleLinkedList.getTrailer());
	}
	
	@Test
	public void testAddFirst() throws Exception {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		DNode node1 = new DNode("Adriano");
		doubleLinkedList.addFirst(node1);
		
		assertEquals(doubleLinkedList.getHeader().getNext().getElement(), "Adriano");
	}
	
	@Test
	public void testRemoveFirst() throws Exception {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		DNode node1 = new DNode("Adriano");
		doubleLinkedList.addFirst(node1);
		
		assertEquals(doubleLinkedList.getHeader().getNext().getElement(), "Adriano");
		
		DNode node2 = new DNode("Camila");
		doubleLinkedList.addFirst(node2);
		
		assertEquals(doubleLinkedList.getTrailer().getPrev().getElement(), "Adriano");
		System.out.println(doubleLinkedList.toString());
		
		doubleLinkedList.remove(node2);
		assertTrue(doubleLinkedList.size() == 1);
		assertEquals(doubleLinkedList.getHeader().getNext().getElement(), "Adriano");
	}
}
