package com.training.nov30;

import java.util.Scanner;

public class BinaryPalindrome {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BinaryPalindrome().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		int n = input.nextInt();
		findBinary(n);
	}

	private void findBinary(int n) {
		int binary = 0, reverse = 0, digit, i = 1;
		while (n > 0) {
			digit = n % 2;
			binary = binary * 10 + digit;
			reverse = digit * i + reverse;
			i *= 10;
			n /= 2;
		}
		System.out.println((binary == reverse) ? binary + " - Palindrome" : binary + " - Not Palindrome");
	}

}
