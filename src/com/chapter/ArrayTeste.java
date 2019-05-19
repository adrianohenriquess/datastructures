package com.chapter;

import java.util.Arrays;
import java.util.Random;

public class ArrayTeste {
	
	public static void main(String[] args) {
		int num[] = new int[100];
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100);
		}
		int[] old = (int[]) num.clone();
		
		System.out.println("Arrays equal before sort: " + Arrays.equals(old, num));
		System.out.println(System.currentTimeMillis());
		Arrays.sort(num);
		System.out.println(System.currentTimeMillis());
		System.out.println("Arrays equal after sort: " + Arrays.equals(old, num));
		System.out.println("old = " + Arrays.toString(old));
		System.out.println("num = " + Arrays.toString(num));
		System.out.println(System.currentTimeMillis());
		insertionSort(old);
		System.out.println(System.currentTimeMillis());
		System.out.println("old = " + Arrays.toString(old));
	}
	
	public static int[] insertionSort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int cur = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > cur) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = cur;
		}
		return a;
	}

}
