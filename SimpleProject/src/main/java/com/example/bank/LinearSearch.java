package com.example.bank;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

	public static int findNumber(int[] arr,int num) {
		
		
		
		int index = 0;
		for(int i =0; i<arr.length;i++) {
			if(num == arr[i]) {
				index = i;
				
			}
			else {
				index =-1;
			}
			
		}
		
		
		return  index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intarr =new int[]{1,2,3,4,5,6};
		String[] str = new String[] {"advsadvsfd","dfdsf","sdfds","fdgfd","fgfdsg"};
	
		 System.out.println(findNumber(intarr, 7));
		 System.out.println(str);
		 System.out.println(intarr);

	}

}
