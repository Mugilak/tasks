package rajeeSanTask;

import java.util.Scanner;

public class PrintMethodImplement {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new PrintMethodImplement().getInput();
	}

	private void getInput() {
		print();
		print("2", "wrf");
	}

	private void print(String... a) {
		System.out.println(a.length + " argument(s)");
	}
}
