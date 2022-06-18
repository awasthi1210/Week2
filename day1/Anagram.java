package day1;

import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		boolean isanagram = false;
		if (str1.length() == str2.length()) {     // Condition to compare the length 
			for (int i = 0; i < str1.length(); i++) 
			{
				for (int j = 0; j < str2.length(); j++) 
				{
					if (str1.charAt(i) == str2.charAt(j))  //comp
					{
						return true;
					}

				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();      //Take two user strings
		String str2 = sc.next();
		boolean result = isAnagram(str1, str2);       // store the result into a variable
		System.out.println(result);            // Print the result

	}

}
