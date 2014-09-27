package secondHomework;

import java.util.Scanner;

public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close(); //closing the scanner
		int counter = 0;
		String hexN = Integer.toBinaryString(n);
		
		for (int i = 1; i < hexN.length(); i++) {
			char prevChar = hexN.charAt(i-1);
			if (prevChar == hexN.charAt(i)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
