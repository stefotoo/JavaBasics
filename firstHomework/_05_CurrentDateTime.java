package firstHomework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _05_CurrentDateTime {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String dateTimeNow = formatter.format(LocalDateTime.now());
		System.out.println(dateTimeNow);
	}
}
