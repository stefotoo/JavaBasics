package fourthHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _15_SumCards {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String[] splittedCards = s.split("[DSCH ]+");
		input.close();
		
		Map<String, Integer> cardsCount = new HashMap<String, Integer>();
		for (String card : splittedCards) {
		  Integer count = cardsCount.get(card);
		  if (count == null) {
		    count = 0; 
		  }
		  cardsCount.put(card, count+1);
		}
		System.out.println(cardsCount); 

	}
}
