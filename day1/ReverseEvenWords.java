package day1;

import java.util.Scanner;

public class ReverseEvenWords {
	private static String[] split;

	public static void findReverse(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			str1 = str.charAt(i) + str1;
		}
		System.out.print(str1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 2 == 0) {
				findReverse(arr[i]);
			}
			else {
				System.out.print(arr[i]);
			}
			System.out.print(" ");
		}

	}

}
