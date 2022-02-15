package com.example.bank;


import java.io.*;
import java.util.ArrayList;

class VowelsInString{
	//The logic is to find the positive number least number

static ArrayList findVowels(ArrayList arr, int N,String word)
{
	ArrayList<Character> res = new ArrayList<Character>();
	for(int i=0;i<N;i++) {
		if(arr.contains(word.charAt(i))) {
			if(!res.contains(word.charAt(i))) {
			res.add(word.charAt(i));
			}
		}
	}
	
	
	return res;
}

public static void main (String[] args)
	{
	ArrayList<Character> arr = new ArrayList<Character>();
	arr.add('a');
	arr.add('e');
	arr.add('i');
	arr.add('o');
	arr.add('u');
	String Name = "Suarabh Dhingra";
	//int K = 11;
	int N = Name.length();
	//System.out.println(arr);
	System.out.print(findVowels(arr, N ,Name));
	}
}