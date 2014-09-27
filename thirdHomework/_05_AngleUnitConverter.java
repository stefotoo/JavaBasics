package thirdHomework;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers will you enter?");
		int n = sc.nextInt();
		sc.nextLine();
		String[] strings = new String[n];
		double[] numbers = new double[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
			strings[i] = sc.next();
			sc.nextLine();
			convertAngles(numbers[i], strings[i]);
		}
		sc.close();
	}

	private static void convertAngles(double number, String str) {
		DecimalFormat decPoints = new DecimalFormat("#.000000");
		
		if (str.equals("deg")) {
			String convertedValue = decPoints.format(Math.toRadians(number));
			System.out.println(convertedValue + " rad");
		}
		if (str.equals("rad")) {
			String convertedValue = decPoints.format(Math.toDegrees(number));
			System.out.println(convertedValue + " deg");
		}
	}
}
