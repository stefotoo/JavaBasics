package exam_22September;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Scanner;

public class _03_WeirdStrings {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		String ss = null;
		String inputS = input.nextLine().replaceAll("[\\\\(\\)\\|\\/ ]*", "");
		String[] words = inputS.split("[^a-zA-z]+");
		int[] lettersSum = new int[words.length];
		int maxSum = 0;
		String maxWord1 = null;
		String maxWord2 = null;
		
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				ss = words[i].toUpperCase();
				char currentChar = ss.charAt(j);
				lettersSum[i] += (currentChar - 'A' + 1);
			}
		}
		
		
		for (int i = 0; i < lettersSum.length - 1; i++) {
			if (lettersSum[i] + lettersSum[i+1] >= maxSum) {
				maxSum = lettersSum[i] + lettersSum[i+1];
				maxWord1 = words[i];
				maxWord2 = words[i+1];
			}
		}
		System.out.println(maxWord1);
		System.out.println(maxWord2);
		input.close();
	}
}
