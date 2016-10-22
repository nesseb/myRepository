package Zad7;

import java.util.Scanner;

public class Zad7 {
	/*
	 * Pobierz od usera napis i wypisz na ekranie tylko te jego znaki, które
	 * le¿¹ w nim na parzystej pozycji i s¹ z przedzia³u <a, e>
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		System.out.println(signs(line));

	}

	public static String signs(String line) {
		char[] ch = line.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < ch.length; i = i + 2) {
			if (ch[i] > 'a' && ch[i] < 'e') {
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}

}
