package com.chapter.recursao;

public class Factorial {

	public static int recursiveFactorial(int n) {
		if (n == 0) return 1;
		else return n * recursiveFactorial(n-1);
	}
	
	public static void main(String[] args) {
		int factorial = recursiveFactorial(5000);
		System.out.println(factorial);
	}
}
