package fourthHomework;

import java.util.HashSet;
import java.util.Scanner;

public class _14_StuckNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] numbers = new String[n];
		HashSet<String> cognateNumbers = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.next();
		}

		for (int a = 0; a < numbers.length; a++) {
			for (int b = 0; b < numbers.length; b++) {
				for (int c = 0; c < numbers.length; c++) {
					for (int d = 0; d < numbers.length; d++) {
						if ((numbers[a] != numbers[b])
								&& (numbers[a] != numbers[b])
								&& (numbers[a] != numbers[c])
								&& (numbers[a] != numbers[d])
								&& (numbers[b] != numbers[c])
								&& (numbers[b] != numbers[d])
								&& (numbers[c] != numbers[d])) {
							boolean check = (numbers[a] + numbers[b])
									.equals(numbers[c] + numbers[d]);
							if (check) {
								cognateNumbers.add(numbers[a] + "|"
										+ numbers[b] + "==" + numbers[c] + "|"
										+ numbers[d]);
							}
						}
					}
				}
			}
		}

		if (cognateNumbers.isEmpty()) {
			System.out.println("No");
		} else {
			for (String cognate : cognateNumbers) {
				System.out.println(cognate);
			}
		}
		input.close();
	}
}
