package thirdHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class _10_OrderOfProducts {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("US"));
		String readProducts = "src/thirdHomework/Products.txt";
		String readOrder = "src/thirdHomework/Order.txt";
		String writeOutput = "src/thirdHomework/Output.txt";
		ArrayList<Product> productList = new ArrayList<Product>();
		readProductsFromFile(readProducts, productList);
		double result = calculateTotalOrder(readOrder, productList, 0);
		writeOrder(writeOutput, result);
	}

	private static void readProductsFromFile(String fileName,
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
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	private static double calculateTotalOrder(String fileName,
			ArrayList<Product> productList, double result) {

		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				fileName));) {

			while (true) {
				Product product = new Product();
				String line = fileReader.readLine();
				if (line == null) {
					break;
				}

				String[] tokens = line.split(" ");
				product.setQuantity(Double.parseDouble(tokens[0]));
				product.setName(tokens[1]);
				for (Product prod : productList) {
					if (prod.getName().equals(product.getName())) {
						result += product.getQuantity() * prod.getPrice();
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		return result;
	}

	private static void writeOrder(String fileName, double result) {

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
			writer.write(String.format("%.1f", result));
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.err.println("Cannot write to the file " + newFile);
			e.printStackTrace();
		}
	}
}