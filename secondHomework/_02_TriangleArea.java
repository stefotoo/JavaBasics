package secondHomework;

import java.util.Locale;
import java.util.Scanner;

public class _02_TriangleArea {
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		double aX = sc.nextDouble();
		double aY = sc.nextDouble();
		double bX = sc.nextDouble();
		double bY = sc.nextDouble();
		double cX = sc.nextDouble();
		double cY = sc.nextDouble();
		sc.close(); //closing the scanner
		double area = (aX * (bY-cY) + bX * (cY-aY) + cX * (aY-bY))/2;
		System.out.println((int) Math.abs(area));
		
	}
}
