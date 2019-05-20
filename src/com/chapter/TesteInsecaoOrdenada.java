package com.chapter;

public class TesteInsecaoOrdenada {
	
	public static void main(String[] args) {
		char[] sort = insertionSort("fbresa".toCharArray());
		System.out.println(sort);
	}
	
	public static char[] insertionSort(char[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			char cur = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > cur) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = cur;
		}
		return a;
	}

}
