package com.chapter;

public class ScoreBoard {
	public static final int maxEntries = 10;
	private int numEntries = 0;
	private GameEntry[] entries;

	public ScoreBoard() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}

	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < numEntries; i++) {
			if (i > 0)
				s += ", ";// separa os registros por virgulas
			s += entries[i];
		}
		return s + "] ";
	}

	// Tenta inserir um novo score na coleção (se ele for grande o suficiente)
	public void add(GameEntry e) {
		int newScore = e.getScore();
		// o novo registro e corresponde mesmo a um dos maiores scores?
		if (numEntries == maxEntries) {// o arranjo esta cheio
			if (newScore <= entries[numEntries - 1].getScore())
				return; // neste caso, a nova entrada, e, não é um dos maiores scores
		} else // o arranjo não está cheio
			numEntries++;

		// localiza o lugar onde o novo registro e (com score grande deve ficar)
		int i = numEntries - 1;
		for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--)
			entries[i] = entries[i - 1];
		entries[i] = e;
	}
	
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= numEntries)
			throw new IndexOutOfBoundsException("Indice inválido: " + i);
		
		GameEntry temp = entries[i];
		for (int j = i; j < numEntries -1; j++) {
			entries[j] = entries[j+1];
		}
		entries[numEntries - 1] = null;
		numEntries--;
		return temp;
	}
}
