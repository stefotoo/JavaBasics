package secondHomework;

import java.util.Locale;
import java.util.Scanner;

public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		sc.close(); //closing the scanner

		if (x < 12.5 || x > 22.5 || y > 13.5 || y < 3.5) {
			System.out.println("Outside");
		} else if (x > 17.5 && x < 20 && y > 8.5) {
			System.out.println("Outside");
			//http://stackoverflow.com/questions/1560492/ 
			//if the point x,y is outside from the rectangle
		} else if ((5 * (y - 8.5) - (-5) * (x - 12.5)) < 0
				|| (5 * (y - 3.5) - 5 * (x - 17.5)) < 0) {
			System.out.println("Outside");
		} else {
			System.out.println("Inside");
		}
	}
}
