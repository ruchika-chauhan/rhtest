package com.test;

/**
 * @author ruchika.chauhan
 * 
 * 
 * This Program used to write no 102030 with two form:
 * 1-as  321000
 * 2- as 123000
 * 
 *
 */
public class EXpediaReverse {
	
public static void main(String[] args) {
	int n=102030;
	int a,b=0,sum=0,count=1;
	while(n>0){
		a=n%10;
		if(a==0){
			count=count*10;
		}else{
		sum=(sum*10)+a;}
		n=n/10;
		
	}
	System.out.println(sum*count);

	while(sum>0){
		a=sum%10;
		b=(b*10)+a;
		sum=sum/10;
		
	}
	System.out.println(b*count);

}
}
