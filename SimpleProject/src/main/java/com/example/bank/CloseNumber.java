<<<<<<< HEAD
package com.example.bank;


import java.io.*;

class CloseNumber{
	//The logic is to find the positive number least number

static double clostVal(double arr[], int N,
					int K)
{
	double res = arr[0];
	for(int i = 1; i < N; i++)
		
	{
		
		 System.out.println(arr[i]);
		  System.out.println("Math.abs(K- res) "+Math.abs(K- res) );
		 System.out.println("Math.abs(K - arr[i]) "+Math.abs(K - arr[i]) );
		 
		if (Math.abs(K- res)  >	Math.abs(K - arr[i]))
		{
			res = arr[i];
		}
		
	}
	return res;
}

public static void main (String[] args)
	{
	double arr[] = { 1,2,3,4,4.5,6,7,9,10,7.5 };
	//int K = 11;
	int N = arr.length;
	
	System.out.print(clostVal(arr, N, 8));
	}
=======
package com.example.bank;


import java.io.*;

class CloseNumber{
	//The logic is to find the positive number least number

static double clostVal(double arr[], int N,
					int K)
{
	double res = arr[0];
	for(int i = 1; i < N; i++)
		
	{
		
		 System.out.println(arr[i]);
		  System.out.println("Math.abs(K- res) "+Math.abs(K- res) );
		 System.out.println("Math.abs(K - arr[i]) "+Math.abs(K - arr[i]) );
		 
		if (Math.abs(K- res)  >	Math.abs(K - arr[i]))
		{
			res = arr[i];
		}
		
	}
	return res;
}

public static void main (String[] args)
	{
	double arr[] = { 1,2,3,4,4.5,6,7,9,10,7.5 };
	//int K = 11;
	int N = arr.length;
	
	System.out.print(clostVal(arr, N, 8));
	}
>>>>>>> 1d609cc71801da8d4662090446aaea9c26a22908
}