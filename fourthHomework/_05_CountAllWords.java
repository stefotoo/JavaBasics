package fourthHomework;

import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String[] splittedS = s.split("[ ()\\-*;.',!?]+");
		System.out.println(splittedS.length);
		input.close();
	}
}
