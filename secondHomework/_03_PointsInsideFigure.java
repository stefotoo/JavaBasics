package secondHomework;

import java.util.Locale;
import java.util.Scanner;

public class _03_PointsInsideFigure {
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		sc.close(); //closing the scanner
		
		if (x < 12.5 || x > 22.5 || y < 6 || y > 13.5) {
			System.out.println("Outside");
		} else if (x > 17.5 && x < 20 && y > 8.5) {
			System.out.println("Outside");
		} else {
			System.out.println("Inside");
		}
		
	}
}
