package com.chapter.recursao.reversearray;

import java.util.Arrays;

public class ReverseArray {
	//recursao final so existe quando um metodo recursivo chama ele mesmo como a ultima coisa que ele faz no metodo
	//o metodo abaixo é recursivo, mas não usa recursao final
	public static String[] reverseArray(String[] array, int i, int j) {
		if (i == j) return array;
		if (i < j) {
			String aux = array[j];
			array[j] = array[i];
			array[i] = aux;
		}
		return reverseArray(array, i + 1, j - 1);
	}
	
	//metodo iterativo de inversao de strings
	public static String[] reverseArrayIterative(String[] array, int i, int j) {
		while (i < j) {
			String aux = array[j];
			array[j] = array[i];
			array[i] = aux;
			i++;
			j--;
		}
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArray(new String[]{"A", "d", "r", "i", "a", "n", "o"}, 0, 6)));
		System.out.println(Arrays.toString(reverseArrayIterative(new String[]{"A", "d", "r", "i", "a", "n", "o"}, 0, 6)));
	}
}
