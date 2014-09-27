package fourthHomework;

import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int counter = 0;
		String s = input.nextLine().toLowerCase();
		String wordInput = input.nextLine().toLowerCase();
		String[] splittedS = s.split("[ ()\\-*;.',!?]+");
		input.close();

		for (String word : splittedS) {
			if (word.equals(wordInput)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
