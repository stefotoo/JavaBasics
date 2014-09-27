package firstHomework;

import java.util.Scanner;

public class _06_SumTwoNumbers {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		
		System.out.println("Please enter the first number: ");
		Scanner sc = new Scanner(System.in);
		firstNumber = sc.nextInt();
		System.out.println("Please enter the second number: ");
		secondNumber = sc.nextInt();
		sc.close();
		
		System.out.println("The result is: " + (firstNumber + secondNumber));
		
	}
}
