package secondHomework;

import java.util.Scanner;

public class _01_RectangleArea {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close(); //closing the scanner
		System.out.print(a * b);
	}
}
