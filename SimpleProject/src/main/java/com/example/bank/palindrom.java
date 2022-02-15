<<<<<<< HEAD
package com.example.bank;

public class palindrom {
	
	public static int palindrom(String str) {
		int len =0;
		int strLen = str.length()-1;
		for(int j=0;j<=str.length();j++) {
			
				if(str.charAt(j) == str.charAt(strLen-j)) {
					len++;
				}
				if(j == strLen-j) {
					break;
				}
			}
		return len+len-1;
	}

	public static void main(String[] args) {
		String s = "randomodnar";
		// TODO Auto-generated method stub
		System.out.println("The length of the palindrom sequence "+ s +" "+ palindrom(s));
	}

}
=======
package com.example.bank;

public class palindrom {
	
	public static int palindrom(String str) {
		int len =0;
		int strLen = str.length()-1;
		for(int j=0;j<=str.length();j++) {
			
				if(str.charAt(j) == str.charAt(strLen-j)) {
					len++;
				}
				if(j == strLen-j) {
					break;
				}
			}
		return len+len-1;
	}

	public static void main(String[] args) {
		String s = "randomodnar";
		// TODO Auto-generated method stub
		System.out.println("The length of the palindrom sequence "+ s +" "+ palindrom(s));
	}

}
>>>>>>> 1d609cc71801da8d4662090446aaea9c26a22908
