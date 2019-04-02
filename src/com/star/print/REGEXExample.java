package com.star.print;

import java.util.regex.Pattern;

class RegexExample1{  
	   public static void main(String args[]){  
	      String content = "-20178--vi--ORA-20178, -1   ORA-00001, unique constraint (SLEMESTRAIN.PK_ITP063) violated ORA-06512, -20178--vi--ORA-20178, -1   ORA-00001, unique constraint (SLEMESTRAIN.PK_ITP063) violated ORA-06512, ";

	      String pattern = "";

	      boolean isMatch = Pattern.matches(pattern, content);
	      System.out.println("The text contains 'book'? " + isMatch);
	   }
	}  
