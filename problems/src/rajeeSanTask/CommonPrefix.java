package rajeeSanTask;

import java.util.Scanner;

public class CommonPrefix {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new CommonPrefix().getInput();
	}

	private void getInput() {
		System.out.println("Enter n : ");
		String n = input.nextLine();
		int min = Integer.MAX_VALUE, index = 0;
		String[] array = new String[Integer.valueOf(n)];
		for (int i = 0; i < Integer.valueOf(n); i++) {
			array[i] = input.nextLine();
		}
		for (int i = 0; i < Integer.valueOf(n); i++) {
			if (min > array[i].length()) {
				min = array[i].length();
				index = i;
			}
		}
		System.out.println(findCommonPrefix(array, index, min) + " - is the common prefix substring");
	}

	private String findCommonPrefix(String[] array, int index, int len) {
		String str = array[index], subStr = "";
		for (int i = 0; i < len; i++) {
			subStr = str.substring(0, i + 1);
			for (String string : array) {
				if (string.equals(str) == false) {
					if ((string.substring(0, i + 1).equals(subStr)) == false) {
						return subStr.substring(0, subStr.length() - 1);
					}
				}
			}
		}
		return subStr;
	}
}
