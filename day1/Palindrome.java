package day1;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		String str1 = "";                    // create an empty string
		for (int i = 0; i < str.length(); i++) {
			str1 = str.charAt(i) + str1;
		}
		if (str1.equals(str)) {       // condition to compare original and reversed string
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);  // take a user input
		String str = sc.nextLine();	
		boolean result = isPalindrome(str);  // call the method and store it in a variable	
		System.out.println(result);        // print the result       
	}

}
