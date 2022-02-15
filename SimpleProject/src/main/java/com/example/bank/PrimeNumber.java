<<<<<<< HEAD
package com.example.bank;

import java.util.*;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println(primeFinder(4));
  }

  public static ArrayList<Integer> primeFinder(int n) {
    ArrayList<Integer> arr =new ArrayList<Integer>();
    int flag = 0;
    // Write your code here
    if(n==0||n==1){
      System.out.println(n +" is not Prime number");   
    }
    else{
   //   for(int i=2; i<=n;i++){
        
        // int len = i/2;
          for(int j=2;j<=n/2;j++){
            if(n%j==0){
               flag = 1;         
               System.out.println("the number is not prime number");
               break;         
            }   
            else{
              flag = 0;
            }
      }
      if(flag==0){
    	  System.out.println("the number is prime number");
      // arr.add(i);
      }
    }  
//  }
   return arr;
}
}
=======
package com.example.bank;

import java.util.*;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println(primeFinder(4));
  }

  public static ArrayList<Integer> primeFinder(int n) {
    ArrayList<Integer> arr =new ArrayList<Integer>();
    int flag = 0;
    // Write your code here
    if(n==0||n==1){
      System.out.println(n +" is not Prime number");   
    }
    else{
   //   for(int i=2; i<=n;i++){
        
        // int len = i/2;
          for(int j=2;j<=n/2;j++){
            if(n%j==0){
               flag = 1;         
               System.out.println("the number is not prime number");
               break;         
            }   
            else{
              flag = 0;
            }
      }
      if(flag==0){
    	  System.out.println("the number is prime number");
      // arr.add(i);
      }
    }  
//  }
   return arr;
}
}
>>>>>>> 1d609cc71801da8d4662090446aaea9c26a22908
