package thirdHomework;

import java.util.Locale;
import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a - 1;
		while (a > b) {
			b = sc.nextInt();
		}

		sc.close();

		for (int i = a; i <= b; i++) {
			if (i == getReverseInt(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static int getReverseInt(int value) {
		int resultNumber = 0;
		for (int i = value; i != 0; i /= 10) {
			resultNumber = resultNumber * 10 + i % 10;
		}
		return resultNumber;
	}
}
