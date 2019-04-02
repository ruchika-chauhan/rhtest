package com.test;

public class Expedia {
public static void main(String[] args) {
	int n=102030;
	int a,b,sum=0;
	int count=1;
	while(n>0){
		a=n%10;
		//System.out.println(a);
		if(a==0){
			count=count*10;
		}else{
			sum=(sum*10)+a;
		}
		n=n/10;
	}
	System.out.println(sum);
	System.out.println(sum*count);

}
}
