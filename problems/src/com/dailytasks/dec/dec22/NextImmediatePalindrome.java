package com.dailytasks.dec.dec22;

import java.util.Scanner;

//098765432345678
//098765434567890

public class NextImmediatePalindrome {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new NextImmediatePalindrome().getInput();
	}

	private void getInput() {
		System.out.println("Enter number");
		String number = input.nextLine();
		int[] num = numberArray(number.toCharArray());
		findNextPalindrome(num);
//		String answer = findNextPalindrome(number.toCharArray());
//		System.out.println(answer);
	}

	private void findNextPalindrome(int[] num) {
		int n = num.length;
		if (n == 1) {
			System.out.println("11");
		} else {
			if (n % 2 == 0) {
				evenLengthed(num, n, n / 2 - 1);
			} else {
				evenLengthed(num, n, n / 2);
			}
			printArray(num);
		}
	}

	private void printArray(int[] num) {
		for (int value : num) {
			System.out.print(value);
		}
	}

	private void evenLengthed(int[] num, int n, int mid) {
		int i = mid;
		int secondPart = getNumber(mid + 1, num.length - 1, num);
		while (i >= 0 && num[i] >= num[mid + 1]) {
			i--;
		}
		i = (i < 0) ? 0 : i;
		int firstPart = getReverseNumber(i, mid, num);
		if (firstPart > secondPart) {
			if (n % 2 == 0) {
				reverse(mid, mid + 1, num);
			} else {
				reverse(mid - 1, mid + 1, num);
			}
		} else {
			addByOne(i, mid, num);
			if (n % 2 == 0) {
				reverse(mid, mid + 1, num);
			} else {
				reverse(mid - 1, mid + 1, num);
			}
		}
	}

	private void addByOne(int start, int mid, int[] num) {
		int carry = 0;
		int value = num[mid] + 1 + carry;
		carry = value / 10;
		num[mid] = value % 10;
		mid--;
		while (mid >= start) {
			value = num[mid] + carry;
			carry = value / 10;
			num[mid] = value % 10;
			mid--;
		}
	}

	private void reverse(int mid, int end, int[] num) {
		int n = num.length;
		while (end < n && mid >= 0) {
			num[end] = num[mid];
			end++;
			mid--;
		}
	}

	private int getReverseNumber(int i, int mid, int[] num) {
		int number = 0;
		while (mid >= i) {
			number = (number * 10) + num[mid];
			mid--;
		}
		return number;
	}

	private int getNumber(int i, int length, int[] num) {
		int number = 0;
		while (i <= length) {
			number = (number * 10) + num[i];
			i++;
		}
		return number;
	}

	private int[] numberArray(char[] array) {
		int n = array.length, k = 0, index = 0, num[] = null;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (array[i] == '0' && flag == true) {
				k++;
				continue;
			}
			if (flag == true) {
				num = new int[(n - k)];
			}
			flag = false;
			num[index++] = array[i] - '0';
		}
		return num;
	}

	private String findNextPalindrome(char[] array) {
		int n = array.length, len = n, mid = 0;
		boolean flag = false;
		String next = "";
		if (n == 1) {
			next = "11";
			return next;
		} else {
			if (len % 2 == 0) {
				mid = len / 2 - 1;
				n = len / 2 - 1;
			} else {
				mid = len / 2;
				n = len / 2;
			}
		}
		for (int i = 0; i <= n; i++) {
			if (i == mid) {
				if (array[i] < '9') {
					next += (char) (array[i] - '0') + 1;
				} else {
					if (len == 2 && array[i + 1] < '9') {
						next += array[i];
					} else {
						flag = true;
						next += "10";
					}
				}
			} else
//				if(array[i]<'9') {
//					
//				}
				next += array[i];
		}
		int length = next.length();
		if (len == 2 && length % 2 != 0) {
			next += reverse(next.toCharArray(), length - 1);
		}
		if (length % 2 != 0 || flag == true || (length % 2 == 0 && len % 2 != 0)) {
			next += reverse(next.toCharArray(), length - 2);
		} else {
			next += reverse(next.toCharArray(), length - 1);
		}
		return next;
	}

	private String reverse(char[] array, int end) {
		String reverse = "";
		while (end >= 0) {
			reverse += array[end];
			end--;
		}
		return reverse;
	}

}
