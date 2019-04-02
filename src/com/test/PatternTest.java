package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	
public native void ruchika();

	
	public static void main(String[] args) {
		int i=0;
		Pattern p=Pattern.compile("(ruchika)");
		Matcher match=p.matcher("I am ruchika chauhan and ruchika chauhan never cries and ruchika always fight for herself and" +
				"ruchika is a great person and ruchika has a good heart");
		while(match.find()){
			i++;
		}
		System.out.println("Occurence of String ruchika::"+i);
	}
}
