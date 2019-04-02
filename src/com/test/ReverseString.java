package com.test;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
	String str="Hello India Country";
	String [] s=str.split(" ");
	String [] snew=new String[s.length];
	String newStr="";
	for (int i = s.length-1,j=0;i>=0;i--,j++) {
		snew[j]=s[i];
		newStr=newStr+s[i]+" ";
	}
	System.out.println(Arrays.toString(snew));
	System.out.println(newStr);

	}

}
