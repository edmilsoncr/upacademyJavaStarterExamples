package pt.upacademy.desafios.desafio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Desafio {

	public static int countDays(String startDateString, String endDateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate startDate = LocalDate.parse(startDateString, formatter);
		LocalDate endDate = LocalDate.parse(endDateString, formatter);
		return (int)ChronoUnit.DAYS.between(startDate, endDate);
	}
}
