package secondHomework;

import java.util.Scanner;

public class _05_DecimalHexadecimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close(); //closing the scanner
		String hex = Integer.toHexString(number);
		System.out.println(hex.toUpperCase());
	}
}
