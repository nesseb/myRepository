package Zad3;

import java.util.Scanner;

public class Zad3 {

	/*
	 * Pobierz od usera napis i zastap wszystkie wystapienia samoglosek znakiem
	 * '_'. Nastêpnie wypisz na ekranie ile w napisie jest wyrazow, ktore
	 * powsta³yby gdybysmy podzieli napis na wyrazy wzgledem znaku '_'
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.nextLine();
		sc.close();
		String test = signChanger(string);

		System.out.println(
				"Inscription replaced the sign: " + signChanger(string) + " Inscription: " + stringCount(test));

	}

	public static String signChanger(String string) {

		String[] vowels = { "a", "u", "o", "e", "i" };

		for (String val : vowels) {
			string = string.replaceAll(val, "_");
		}

		return string;
	}

	public static int stringCount(String string) {
		int count = 0;
		char[] c = string.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if ('_' == c[i]) {
				count++;
			}
		}
		return count;
	}

}
