package Zad5;

import java.util.Scanner;

/*
 * Pobierz od usera dwa napisy i wypisz na ekranie ten, który posiada wiêcej cyfr.
 */
public class Zad5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("First word.");
		String line1 = sc.nextLine();
		System.out.println("Second word.");
		String line2 = sc.nextLine();
		sc.close();
		digitCount(line1, line2);
	}

	public static void digitCount(String x, String y) {
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < x.length(); i++) {
			if (Character.isDigit(x.charAt(i))) {
				count1++;
			}
		}

		for (int j = 0; j < y.length(); j++) {
			if (Character.isDigit(y.charAt(j))) {
				count2++;
			}
		}

		if (count1 > count2) {
			System.out.println("More digits has: "+x+" -first word");
		} else {
			System.out.println("More digits has: "+y+" -second word");
		}

	}

}
