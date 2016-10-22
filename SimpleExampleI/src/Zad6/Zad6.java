package Zad6;

import java.util.Scanner;

public class Zad6 {
	/*
	 * Pobierz od usera napis i sprawdŸ, czy w napisie wystêpuj¹ parami te sam
	 * litery, czyli np aabbccdd. Je¿eli tak to zwróæ "PARA", a jak nie to NIE
	 * "NIE PARA".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		checkDuplicate(line);
		sc.close();
	}

	public static void checkDuplicate(String text) {
		String[] array = text.split("");
		String prev = "";
		String status = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(prev) == 0) {
				status = "PARA";
			} else if (array[i].compareTo(prev) == 1) {
				status = "NIE PARA";
			}
			System.out.println(status +" ["+ prev +", "+ array[i]+"]");
			prev = array[i];
			
		}
	}
}
