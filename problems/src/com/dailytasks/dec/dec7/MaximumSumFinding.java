package com.dailytasks.dec.dec7;

import java.util.*;

public class MaximumSumFinding {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MaximumSumFinding().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int size = input.nextInt();
		System.out.println("Enter array elements : ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		findMaximumSum(size, array);
	}

	private void findMaximumSum(int size, int[] array) {
		int sum = 0, max = 0;
		for (int i = 0; i < size; i++) {
			if ((sum + array[i]) < 0) {
				sum = 0;
			} else {
				array[i] = sum + array[i];
				sum = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
