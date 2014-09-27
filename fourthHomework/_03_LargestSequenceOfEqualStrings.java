package fourthHomework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int largestSequence = -1;
		String largestWord = null;
		String[] splittedString = s.split(" ");
		Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
		for (String word : splittedString) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
		}

		for (String word : wordsCount.keySet()) {
			if (wordsCount.get(word) > largestSequence) {
				largestSequence = wordsCount.get(word);
				largestWord = word;
			}
		}

		for (int i = 0; i < largestSequence; i++) {
			System.out.print(largestWord + " ");
		}
		input.close();
	}
}
