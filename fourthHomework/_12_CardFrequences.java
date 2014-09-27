package fourthHomework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardFrequences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s = input.nextLine().toLowerCase();
		input.close();
		String[] splittedS = s.split("[ ♥♣♦♠]+");
		Map<String, Integer> cards = new LinkedHashMap<String, Integer>();
		for (String card : splittedS) {
			Integer count = cards.get(card);
			if (count == null) {
				count = 0;
			}
			cards.put(card, count + 1);
		}

		for (Map.Entry<String, Integer> entry : cards.entrySet()) {
		    double precentage = (double) entry.getValue() * 100 / splittedS.length;
		    System.out.printf("%s -> %.2f%%\n", entry.getKey(), precentage);
		}
	}
}
