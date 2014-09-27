package secondHomework;

import java.util.Scanner;

public class _07_CountBitsOne {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close(); //closing the scanner
		int counter = 0;
		String hexN = Integer.toBinaryString(n);
		
		for (int i = 0; i < hexN.length(); i++) {
			
			if (hexN.charAt(i) == '1') {
				counter++;
			}
		}
		System.out.println(counter);
		
	}
}
