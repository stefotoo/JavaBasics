package exam_22September;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class _02_MagicSum {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		int dividerOne = 0;
		int dividerTwo = 0;
		int dividerThree = 0;
		long maxSum = -2000000000;
		int counter = 0;
		while (true) {
			String number = input.nextLine();
			if (number.equals("End")) {
				break;
			}

			numbers.add(Integer.parseInt(number));
		}

		int divider = numbers.get(0);
		numbers.remove(0);

		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				for (int j2 = j + 1; j2 < numbers.size(); j2++) {
					if (divider == 0) {
						break;
					}
					if ((numbers.get(i) + numbers.get(j) + numbers.get(j2))
							% divider == 0) {
						if ((numbers.get(i) + numbers.get(j) + numbers.get(j2)) > maxSum) {
							maxSum = (numbers.get(i) + numbers.get(j) + numbers
									.get(j2));
							dividerOne = numbers.get(i);
							dividerTwo = numbers.get(j);
							dividerThree = numbers.get(j2);
							counter++;
						}
					}
				}
			}
		}
		if (divider == 0 || counter == 0) {
			System.out.println("No");
		} else {
			System.out.println("(" + dividerOne + " + " + dividerTwo + " + "
					+ dividerThree + ") % " + divider + " = 0");
		}
		input.close();
	}
}
