package com.chapter.recursao.binaria;

public class FibonacciRecursaoBinaria {

	public static void main(String[] args) {
		int k = 8;
		int result = binaryFibonacci(k);
		System.out.println(result);
	}

	private static int binaryFibonacci(int k) {
		if (k <= 1) return k;
		else return binaryFibonacci(k - 1) + binaryFibonacci(k - 2);
	}
	
}
