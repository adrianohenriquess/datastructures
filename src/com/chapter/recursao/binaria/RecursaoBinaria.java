package com.chapter.recursao.binaria;

public class RecursaoBinaria {
	
	private static int binarySum(int[] a, int i, int n) {
		if (n == 1) return a[i];
		else return binarySum(a, i, n/2) + binarySum(a, i + (n/2), n/2);
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int i = 0, n = 8;
		System.out.println(binarySum(a, i, n));
	}

}
