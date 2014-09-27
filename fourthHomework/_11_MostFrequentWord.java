package fourthHomework;

import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s = input.nextLine().toLowerCase();
		Integer mostFrequent = 1;
		input.close();
		TreeMap<String, Integer> words = mostFrequentWord(s);
		// find max word repeats
		for (String key : words.keySet()) {
			if (words.get(key) > mostFrequent) {
				mostFrequent = words.get(key);
			}
		}
		for (String key : words.keySet()) {
			if (words.get(key) == mostFrequent) {
				System.out.println("" + key + " -> " + words.get(key)
						+ " times");
			}
		}

	}

	private static TreeMap<String, Integer> mostFrequentWord(String string) {
		String[] splittedS = string.split("([().,!?:;'\"-]|\\s)+");
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();
		for (String word : splittedS) {
			Integer count = words.get(word);
			if (count == null) {
				count = 0;
			}
			words.put(word, count + 1);

		}
		return words;
	}
}
