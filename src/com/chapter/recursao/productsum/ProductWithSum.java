package com.chapter.recursao.productsum;

public class ProductWithSum {
	
	public static void main(String[] args) {
		int n = 7, m = 8;
		int product = product(m, n);
		System.out.println(product);
	}

	private static int product(int m, int n) {
		if (n == 0) return n;
		return m + product(m, n-1) ;
	}

}
