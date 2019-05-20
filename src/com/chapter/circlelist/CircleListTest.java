package com.chapter.circlelist;

import org.junit.Test;

import com.chapter.linkedlist.Node;

public class CircleListTest {

	@Test
	public void testAddAndRemoveCircleList() throws Exception {
		CircleList circleList = new CircleList();
		Node node1 = new Node();
		node1.setElement("Adriano");
		circleList.add(node1);
		
		Node node2 = new Node();
		node2.setElement("Fernando");
		circleList.add(node2);
		
		Node node3 = new Node();
		node3.setElement("Gabriel");
		circleList.add(node3);
		
		System.out.println(circleList.toString());
	}
}
