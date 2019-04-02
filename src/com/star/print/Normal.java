package com.star.print;

import java.util.regex.Pattern;

public class Normal {
	 public static void main(String[] args) {
	    	System.out.println(setErrorMessage(" -20178--vi--ORA-20178, -1   ORA-00001, unique constraint (SLEMESTRAIN.PK_ITP063) violated ORA-06512, -20178--vi--ORA-20178, -1  ORA-00001, unique constraint (SLEMESTRAIN.PK_ITP063) violated ORA-06512, "));
		} 
	 
	 
	 
	 public static String setDBErrorMessage1(String strValue){
			int pos 			= 0;
			String strExtract	= "";
				try{
					pos 		= strValue.indexOf(": at");
					strExtract 	= strValue.substring(0,pos);
					pos 		= strExtract.lastIndexOf("ORA");
					if(pos >- 1){
						strExtract 	= strExtract.substring(0,pos);
						pos 		= strExtract.lastIndexOf("ORA");
						strExtract 	= strExtract.substring(pos+1);
						pos 		= strExtract.indexOf(":");
						strExtract 	= strExtract.substring(pos+1);
						pos 		= strExtract.indexOf("~t");
						if(pos <= 0){
							pos = 0;
						}else{
							pos = 3;
						}
						strExtract 	= strExtract.substring(pos).toUpperCase();
					}else{
						strExtract	= strValue;
					}
				}catch(Exception e){
					strExtract	= strValue;
				}
			return formatErrorMsg2(strExtract.trim());
		}
	 public static String formatErrorMsg2(String error) {

	        String t = "java.sql.SQLException: ORA";
	        int i = error.lastIndexOf(t);
	        int index = 0;

	        if (i == -1) {
	            i = error.indexOf("ORA");
	            index = 3;
	        } else {
	            index = 26;
	        }

	        if (i != -1) {
	        	String temp=null;
	        	if(i<1){
	        		  temp = error.substring(i + index, error.length());
	        		  System.out.println(temp);
	        	}else
	        	{
	                temp =error.substring(0,i);
	                System.out.println("elseeee"+temp);
	        	}


	            int firstIndex = temp.indexOf("~t");
	            int lastIndex = temp.lastIndexOf("~t");

	            if ((firstIndex != -1) && (lastIndex != -1)) {

	                String secondString = temp.substring(firstIndex + 2, lastIndex);


	                int anotherIndex = secondString.indexOf("~t");
	                temp = (secondString.substring(0, anotherIndex) + ", " +
	                    secondString.substring((anotherIndex + 2),
	                        secondString.length())).toUpperCase();

	                return ReplaceChar(temp, String.valueOf((char) 10),
	                    "");
	            } else {
	                firstIndex = temp.indexOf(": ") + 1;
	                lastIndex = temp.indexOf("Caused by:");

	                int cnt = temp.indexOf(String.valueOf((char) 10));

	                if (lastIndex == -1) {
	                    temp = temp.substring(firstIndex,(cnt == -1) ? temp.length() : cnt)
	                               .toUpperCase();

	                    return ReplaceChar(temp,
	                        String.valueOf((char) 10), "");
	                } else {
	                    temp = (temp.substring(firstIndex, lastIndex)).toUpperCase();

	                    return ReplaceChar(temp,
	                        String.valueOf((char) 10), "");
	                }
	            }
	        } else {
	            if(error.indexOf("java.sql.SQLException:") != -1) {
	                error= error.substring(error.indexOf("java.sql.SQLException:")+ ("java.sql.SQLException:").length());
	                return error;
	            } else {
	                return error;
	            }

	        }
	    }
	 public static String ReplaceChar(String s, String s1, String s2) {
	        if (s == null) {
	            return "";
	        }

	        int i = s.length();
	        int j = s1.length();
	        String s3 = new String("");

	        for (int k = 0; k < i; k++) {
	            if ((k + j) > i) {
	                s3 = s3 + s.substring(k, i);

	                break;
	            }

	            if (s.substring(k, j + k).equals(s1)) {
	                if (!s2.equals("^")) {
	                    s3 = s3 + s2;
	                    k += (j - 1);
	                }
	            } else {
	                s3 = s3 + s.charAt(k);
	            }
	        }

	        return s3;
	    }
	 public static String setErrorMessage(String error)
	    {
	    	// RCL-22065, Check if there is : in error message. If no : then no decode is needed.
	    	if (error.indexOf(":") == -1)
	    	{  
	    		if(error.contains("ORA-00001")) {
	    			int index1=error.indexOf("unique");
	    			int index2=error.indexOf("violated");
                     if(index1>-1 && index2>-1) {
            			 error=error.substring(index1, index2+8);
            			}
                         error=error+". Record already exist.";
				}
				
	    		return setDBErrorMessage1(error.replaceAll("\\s"," ").replaceAll("[\\t\\n\\r]+",""));
	    	}
	    	
	    	
	    	String decode[] = error.split(": ");
			String strer ="";
			for(int k=1;k<decode.length;k++)
			{
				if (!decode[k].startsWith("ORA-") &&  !decode[k].startsWith("PL/SQL") && !decode[k].startsWith("at")&& !decode[k].startsWith("java"))
						strer +=decode[k] + ", ";
			} 
			error=strer;
	    	
			return setDBErrorMessage1(error.replaceAll("\\s"," ").replaceAll("[\\t\\n\\r]+",""));
	    }
	  public static String formatErrorMsg(String error) {
	    	//Added for EMES-2564 by yger 16/12/2010
	    	String formattedMsg = error;
		    do {
		        formattedMsg = formatErrorMsg1(formattedMsg);
		    } while (formattedMsg.indexOf("ORA-") != -1);
		
		    return formattedMsg;
	    }
	    
	  //Added for EMES-2564 by yger 16/12/2010
	    public static String formatErrorMsg1(String error) {

	        String t = "java.sql.SQLException: ORA";
	        int i = error.lastIndexOf(t);
	        int index = 0;

	        if (i == -1) {
	            i = error.indexOf("ORA");
	            index = 3;
	        } else {
	            index = 26;
	        }

	        if (i != -1) {
	            String temp = error.substring(i + index, error.length());


	            int firstIndex = temp.indexOf("~t");
	            int lastIndex = temp.lastIndexOf("~t");

	            if ((firstIndex != -1) && (lastIndex != -1)) {

	                String secondString = temp.substring(firstIndex + 2, lastIndex);


	                int anotherIndex = secondString.indexOf("~t");
	                temp = (secondString.substring(0, anotherIndex) + ", " +
	                    secondString.substring((anotherIndex + 2),
	                        secondString.length())).toUpperCase();

	                return ReplaceChar(temp, String.valueOf((char) 10),
	                    "");
	            } else {
	                firstIndex = temp.indexOf(": ") + 1;
	                lastIndex = temp.indexOf("Caused by:");

	                int cnt = temp.indexOf(String.valueOf((char) 10));

	                if (lastIndex == -1) {
	                    temp = temp.substring(firstIndex,(cnt == -1) ? temp.length() : cnt)
	                               .toUpperCase();

	                    return ReplaceChar(temp,
	                        String.valueOf((char) 10), "");
	                } else {
	                    temp = (temp.substring(firstIndex, lastIndex)).toUpperCase();

	                    return ReplaceChar(temp,
	                        String.valueOf((char) 10), "");
	                }
	            }
	        } else {
	            if(error.indexOf("java.sql.SQLException:") != -1) {
	                error= error.substring(error.indexOf("java.sql.SQLException:")+ ("java.sql.SQLException:").length());
	                return error;
	            } else {
	                return error;
	            }

	        }
	    }

}
