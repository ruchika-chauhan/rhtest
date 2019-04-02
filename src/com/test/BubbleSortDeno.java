package com.test;

import java.util.Arrays;

public class BubbleSortDeno {
    
	public static void main(String[] args) {
		int [] a= {34,14,25,38,10};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length-1; j++) {
				if(a[j]<a[i]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
