<<<<<<< HEAD
package com.example.bank;

import java.util.ArrayList;

public class FIZZBUZZ {
	
	public static ArrayList<Comparable> fizzbuzz(int n) 

	  {
	    ArrayList list = new ArrayList();
	    for(int i =1;i<=n;i++){
	      if(i%3==0 && i%5 == 0){
	        list.add("FizzBuzz");

	      }
	     else if(i%3 == 0){
	        list.add("Fizz");
	      }
	      else if(i%5 == 0){
	        list.add("Buzz");

	      }
	      
	      else{
	        list.add(i);
	      }


	    }
	    return list;
	  }
	
		
	  public static void main(String[] args) {
	    System.out.println(fizzbuzz(16));
	  }

	  
	}

=======
package com.example.bank;

import java.util.ArrayList;

public class FIZZBUZZ {
	
	public static ArrayList<Comparable> fizzbuzz(int n) 

	  {
	    ArrayList list = new ArrayList();
	    for(int i =1;i<=n;i++){
	      if(i%3==0 && i%5 == 0){
	        list.add("FizzBuzz");

	      }
	     else if(i%3 == 0){
	        list.add("Fizz");
	      }
	      else if(i%5 == 0){
	        list.add("Buzz");

	      }
	      
	      else{
	        list.add(i);
	      }


	    }
	    return list;
	  }
	
		
	  public static void main(String[] args) {
	    System.out.println(fizzbuzz(16));
	  }

	  
	}

>>>>>>> 1d609cc71801da8d4662090446aaea9c26a22908
