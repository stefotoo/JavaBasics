package thirdHomework;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		String dateF = sc.next();
		String dateS = sc.next();
		sc.close(); //closing the scanner

		String[] dateFirst = dateF.split("-");
		String[] dateSecond = dateS.split("-");

		int yearFirst = Integer.parseInt(dateFirst[2]);
		int monthFirst = Integer.parseInt(dateFirst[1]);
		int dayFirst = Integer.parseInt(dateFirst[0]);
		int yearSecond = Integer.parseInt(dateSecond[2]);
		int monthSecond = Integer.parseInt(dateSecond[1]);
		int daySecond = Integer.parseInt(dateSecond[0]);

		DateTime past = new DateTime(yearFirst, monthFirst, dayFirst, 0, 0);
		DateTime today = new DateTime(yearSecond, monthSecond, daySecond, 0, 0);
		int days = Days.daysBetween(past, today).getDays();

		System.out.print(days);
	}
}
