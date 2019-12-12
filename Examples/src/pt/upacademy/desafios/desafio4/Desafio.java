package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

	public static int[] ints(String string) {
		List<Integer> numbers = new ArrayList<Integer>();
		String stringArray[] = string.split(" ");
		for (String stringItem : stringArray) {
			Scanner sc = new Scanner(stringItem);
			if (sc.hasNextInt()) {
				numbers.add(sc.nextInt());
			}
			sc.close();
		}
		return numbers.stream().mapToInt(i -> i).toArray();
	}
}
