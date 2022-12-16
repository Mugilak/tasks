package com.dailytasks.dec.dec8;

import java.util.*;

public class AlphabetsSeries {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AlphabetsSeries().getInput();
	}

	private void getInput() {
		System.out.println("Enter num : ");
		int num = input.nextInt();
		findSequence(num);
	}

	private void findSequence(int num) {
		if (num <= 0) {
			System.out.println("invalid");
			return;
		}
		if (num <= 26) {
			System.out.println((char) (num % 26 + 96));
		} else {
			String answer = ((char) (num / 26 + 96)) + "" + ((char) (num % 26 + 96));
			System.out.println(answer);
		}
	}

}
