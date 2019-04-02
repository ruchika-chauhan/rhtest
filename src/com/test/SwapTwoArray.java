package com.test;

import java.util.Arrays;

public class SwapTwoArray {
public static void main(String[] args) {
	int a[]={1,2,3};
	int b[]={4,5,6};
	int c[]=new int[3];
	System.out.println("Befor Swaping Array a>>"+Arrays.toString(a));
	System.out.println("Array b>>"+Arrays.toString(b));
	for (int i = 0; i < a.length; i++) {
		c[i]=a[i];
		       a[i]=b[i];
		b[i]=c[i];
	}
	System.out.println("After swaping Array a>>"+Arrays.toString(a));
	System.out.println("After Swaping Array b>>"+Arrays.toString(b));
}
}
