package exam_22September;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Nuts {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		TreeMap<String, LinkedHashMap<String, Integer>> amounts = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String splittedInfo = input.nextLine();
			String[] s = splittedInfo.split(" ");
			String company = s[0];
			int amount = Integer.parseInt(s[2].replaceAll("kg", ""));
			String nuts = s[1];

			if (!amounts.containsKey(company)) {
				LinkedHashMap<String, Integer> customers = new LinkedHashMap<>();
				customers.put(nuts, amount);
				amounts.put(company, customers);
			} else if (!amounts.get(company).containsKey(nuts)) {
				amounts.get(company).put(nuts, amount);
			} else {
				amount += amounts.get(company).get(nuts);
				amounts.get(company).put(nuts, amount);
			}

		}

		for (String company : amounts.keySet()) {
			System.out.print(company + ": ");
			Map<String, Integer> customers = new LinkedHashMap<>(
					amounts.get(company));
			int count = 0;

			for (String customer : customers.keySet()) {
				if (count > 0) {
					System.out.printf(", %s-%dkg", customer,
							customers.get(customer));
				} else {
					System.out.printf("%s-%dkg", customer,
							customers.get(customer));
				}
				count++;
			}
			System.out.println();
		}

		input.close();
	}
}
