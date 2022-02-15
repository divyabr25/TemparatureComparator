package com.example.bank;

public class Fibannacci {
	public static int fibFinder(int n) {
	    int fib =0;
	    int first =0;
	     int second =1;
	     int i =2;
	     if(n==0){
	       return fib ;
	     }
	     else if(n==1){
	       return fib =1;
	     }
	     else{
	       while(i<=n){  
	          fib = first+second;
	          first = second;
	          second = fib;
	          System.out.println("fib ("+n+") of "+i+" is " + fib);
	          i++;
	          
	          }  
	     }         
	    return fib;
	  }
		  public static void main(String[] args) {
		    System.out.print(fibFinder(6));
		  }

		  
		

}
