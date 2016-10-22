package Zad8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Zad8 {
	/*
	 * Pobierz od usera napis i sprawdŸ, czy napis zawiera prawid³owy format
	 * daty. Poprawny format daty to rrrr-mm-dd. (uwaga to zadanie robi siê ju¿
	 * typowo na wyra¿eniach regularnych, ale na razie æwiczymy napisy)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		System.out.println(checkDate(line));

	}

	public static boolean checkDate(String line) {
		Date date = null;
		String format = "yyyy-MM-dd";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(line);
			if(!line.equals(sdf.format(date))){
				return false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return true;
	}

}
