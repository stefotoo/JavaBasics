package firstHomework;

import java.util.Scanner;

public class _08_SortArrayOfStrings {

	public static void main(String[] args) {

		int numberOfStrings;

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of strings: ");
		numberOfStrings = sc.nextInt();

		String[] strings = new String[numberOfStrings];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = sc.next();
		}

		sortStringBubble(strings);

		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		sc.close();

	}

	public static void sortStringBubble(String x[]) {
		int j;
		boolean flag = true; // will determine when the sort is finished
		String temp;

		while (flag) {
			flag = false;
			for (j = 0; j < x.length - 1; j++) {
				if (x[j].compareToIgnoreCase(x[j + 1]) > 0) { // ascending sort
					temp = x[j];
					x[j] = x[j + 1]; // swapping
					x[j + 1] = temp;
					flag = true;
				}
			}
		}
	}
}
