package com.test;

import java.util.Arrays;

public class ArraySorting {
	public static void main1(String[] args) {
		int a[]={21,22,45,7,9,46,34,23,43,56,78};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("Ascending order :"+Arrays.toString(a));
		
	}
	public static void main(String[] args) {
		int a[]={21,22,45,7,9,46,34,23,43,56,78};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
		}
		System.out.println("Descding order :"+Arrays.toString(a));
		
	}

}
