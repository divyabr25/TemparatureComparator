<<<<<<< HEAD
package com.example.bank;

public class FindMissing {
	
	
	public static int findMissing(int[] arr) {
	int diff =  arr[1]-arr[0];
	int present =0;
	for(int i=0; i<arr.length;i++){
		if(arr[i]==0){
			int pre = arr[i-1];
			 present = pre+diff;
			 System.out.println(present);
			}
		}
	return present;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,0,4,5,0};
		System.out.println(findMissing(arr1));
	}

}
=======
package com.example.bank;

public class FindMissing {
	
	
	public static int findMissing(int[] arr) {
	int diff =  arr[1]-arr[0];
	int present =0;
	for(int i=0; i<arr.length;i++){
		if(arr[i]==0){
			int pre = arr[i-1];
			 present = pre+diff;
			 System.out.println(present);
			}
		}
	return present;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,0,4,5,0};
		System.out.println(findMissing(arr1));
	}

}
>>>>>>> 1d609cc71801da8d4662090446aaea9c26a22908
