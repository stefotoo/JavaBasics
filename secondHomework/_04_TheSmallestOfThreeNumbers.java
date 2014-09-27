package secondHomework;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class _04_TheSmallestOfThreeNumbers {
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close(); //closing the scanner
		DecimalFormat format = new DecimalFormat();
		format.setDecimalSeparatorAlwaysShown(false);
		
		if (a <= b) {
			System.out.println(format.format(Math.min(a, c)));
		} else {
			System.out.println(format.format(Math.min(b, c)));
		}
	}
}
