package rajeeSanTask;

import java.util.Scanner;

public class SpiralForm {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SpiralForm().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		int n = input.nextInt();
		doPattern(n);
	}

	private void doPattern(int n) {
		int num = 1, start =1,end=5,loop=1;
		int array[][]=new int[n][n];
	}

}
