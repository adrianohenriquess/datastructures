package com.chapter;

public class Test {

	public static void main(String[] args) {
		ScoreBoard board = new ScoreBoard();
		GameEntry gameEntry = new GameEntry("Adriano", 433);
		board.add(gameEntry);
		
		GameEntry gameEntry2 = new GameEntry("Fernando", 654);
		board.add(gameEntry2);
		
		
		GameEntry remove = board.remove(0);
		System.out.println(remove.getName());
	}

}
