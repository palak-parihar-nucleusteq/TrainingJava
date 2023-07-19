package com.nucleus.Exercise4;

import java.util.Arrays;

public class Array {

	public Array() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		int a[] = {23, 45, 56, 67};
		
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		
		int sum  = 0;
		for(int aa: a) {
			sum+=aa;
		}
		System.out.println(sum/a.length);
	}
}
