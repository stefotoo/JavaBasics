package fourthHomework;

import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] tokens = line.split(" ");
		System.out.print(tokens[0]);
		for (int i = 1; i < tokens.length; i++) {
			if (tokens[i].equals(tokens[i - 1])) {
				System.out.print(" " + tokens[i]);
			} else {
				System.out.println();
				System.out.print(tokens[i]);
			}
		}
		scanner.close();
	}
}
