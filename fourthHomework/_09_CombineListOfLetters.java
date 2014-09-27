package fourthHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Character> firstList = new ArrayList<>();
		ArrayList<Character> secondList = new ArrayList<>();
		for (char character : input.nextLine().toCharArray()) {
			firstList.add(character);
		}
		for (char character : input.nextLine().toCharArray()) {
			secondList.add(character);
		}
		input.close();
		ArrayList<Character> output = new ArrayList<>();
		output.addAll(firstList);
		for (int i = 0; i < secondList.size(); i++) {
			if (!firstList.contains(secondList.get(i))) {
				output.add(' ');
				output.add(secondList.get(i));
			}
		}
		for (char character : output) {
			System.out.print(character);
		}
	}
}
