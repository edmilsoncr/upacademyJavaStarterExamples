package pt.upacademy.desafios.desafio2;

import java.util.Arrays;

public class Desafio {

	public static String order(String string) {
		if (string.isEmpty()) {
			return "";
		}
		String stringArray[] = string.split(" ");
		String result = "";
		for (int i = 0; i <= 9; i++) {
			String number = Integer.toString(i);
			for (int j = 0; j < stringArray.length; j++) {
				if (stringArray[j].contains(number)) {
					result += stringArray[j] + " ";
				}
			}
		}
		result = result.substring(0, result.length() - 1);
		System.out.println(result);
		return result;
	}
}
