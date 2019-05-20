package com.chapter.recursao.reversearray;

import java.util.Arrays;

public class ReverseArray {

	public static String[] reverseArray(String[] array, int i, int j) {
		if (i == j) return array;
		if (i < j) {
			String aux = array[j];
			array[j] = array[i];
			array[i] = aux;
		}
		return reverseArray(array, i + 1, j - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArray(new String[]{"A", "d", "r", "i", "a", "n", "o"}, 0, 6)));
	}
}
