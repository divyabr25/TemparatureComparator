package com.example.bank;

import java.util.HashMap;

public class CharacterCount {
	
	public static HashMap countChar(String str) {
		int value =0;
		HashMap<Character,Integer> alphaCount = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
		
			if(alphaCount.containsKey(str.charAt(i))) {
				// value = alphaCount.get(str.charAt(i));
				alphaCount.put(str.charAt(i),++value);
				}
			else {
				 value = 1;
				alphaCount.put(str.charAt(i),value);
			}
		}
		//System.out.println(alphaCount.size());
	//	System.out.println(alphaCount);
		return alphaCount;
	}
	
	 public static void main( String[] args )
	    {
	       // System.out.println( "CHARCTAERCOUNT" );
	        //CharacterCount count = new CharacterCount();
	  //      count.
	       System.out.println(countChar("CHARCTAERCOUNT"));
	        
	        
	    }

}
