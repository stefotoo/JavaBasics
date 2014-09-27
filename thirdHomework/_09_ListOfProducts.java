package thirdHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class _09_ListOfProducts {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("US"));
		String readFileName = "src/thirdHomework/Input.txt";
		String writeFileName = "src/thirdHomework/Output.txt";
	
		ArrayList<Product> productList = new ArrayList<Product>();
		readProductsFromFile(readFileName, productList);
		writeProductsToFile(writeFileName, productList);
	}

	public static void readProductsFromFile(String fileName,
			ArrayList<Product> productList) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				fileName));) {

			while (true) {
				Product product = new Product();
				String line = fileReader.readLine();
				if (line == null) {
					break;
				}

				String[] tokens = line.split(" ");
				product.setName(tokens[0]);
				product.setPrice(Double.parseDouble(tokens[1]));
				productList.add(product);
			}
			Collections.sort(productList);
			for (Product pro : productList) {
				System.out.printf("%.2f %s\n", pro.getPrice(), pro.getName());
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public static void writeProductsToFile(String fileName,
			ArrayList<Product> productList) {

		File newFile = new File(fileName);
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			System.err.println("Cannot create the file " + newFile);
			e.printStackTrace();
		}

		try {
			// creates a FileWriter Object
			FileWriter writer = new FileWriter(newFile);
			// Writes the content to the file
			for (int i = 0; i < productList.size(); i++) {
				Product product = productList.get(i);
				DecimalFormat decPoints = new DecimalFormat("#.00");
				writer.write(product.getName() + " "
						+ decPoints.format(product.getPrice()) + "\r\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.err.println("Cannot write to the file " + newFile);
			e.printStackTrace();
		}
	}
}
