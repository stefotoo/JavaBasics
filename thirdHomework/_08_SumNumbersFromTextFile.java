package thirdHomework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("US"));
		String fileName = "src/thirdHomework/Input.txt";
		int sum = 0;
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				fileName));) {
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					// End of file is reached
					break;
				}
				sum += Integer.parseInt(line);
			}
		} catch (IOException ioex) {
			System.err.println("Cannot read the file " + fileName);
			ioex.printStackTrace();
		}
		System.out.println(sum);
	}
}
