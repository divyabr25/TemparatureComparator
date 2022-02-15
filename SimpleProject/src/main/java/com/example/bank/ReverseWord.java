package com.example.bank;

public class ReverseWord {
	  public static void main(String[] args) {
	  //  System.out.print(wordReverser("Codecademy rules"));
	 //   System.out.print(wordReverser("C o d e c a d e m y"));
	    System.out.print(wordReverser("May the Fourth be with you"));
	  }

	  public static String wordReverser(String input) {
	    // Write your code here
	  // input = "May the Fourth be with you";
	   //String str = "";
		 // String[] splited = {"May","the", "Fourth", "be", "with", "you"};
	   String[] splited = input.split(" ");
	    input = "";
	    for(int i=splited.length-1;i>=0;i--){
	      
	      input = input+splited[i];
	      if(i!=0){
	         input = input+" ";
	      }
	     
	    }
	    return input;
	  }
	}