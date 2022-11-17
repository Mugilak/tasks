package rajeeSanTask.copy;

import java.util.Scanner;

class SpiralForm {
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
		int array[][] = new int[n][n];
		int value = 0, rowBegin = 0, rowEnd = n - 1, colBegin = 0, colEnd = n - 1;
		while (colBegin <= colEnd) {
			for (int i = rowBegin; i <= rowEnd; i++) {
				array[rowBegin][i] = ++value;
			}
			rowBegin++;
			for (int i = rowBegin; i <= rowEnd; i++) {
				array[i][colEnd] = ++value;
			}
			colEnd--;
			for (int i = colEnd; i >= colBegin; i--) {
				array[rowEnd][i] = ++value;
			}
			rowEnd--;
			for (int i = rowEnd; i >= rowBegin; i--) {
				array[i][colBegin] = ++value;
			}
			colBegin++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
