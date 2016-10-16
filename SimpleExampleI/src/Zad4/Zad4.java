package Zad4;

import java.util.Scanner;

public class Zad4 {
	/*
	 * Pobierz od usera napis i sprawdz czy sk³ada sie z dokladnie dwoch
	 * wyrazow. Jezeli tak,to sprawdz czy pierwszy ma tylko same litery duze, a
	 * drugi napis ma tylko same litery male. Jezeli tak to wyswitl komunikat
	 * OK, nie nie to wyswietl NOT OK.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		sc.close();
		if(checkLength(string) == true){
			System.out.println(checkSize(string));
		}
		else if(checkLength(string) == false){
			System.out.println("Invalid number of words \nB³êdna iloœæ s³ów");
		}
	}

	public static boolean checkLength(String string) {
		String[] words = string.split("\\s+");
		
		if(words.length != 2){
			return false;
		}
		return true;
	}
	
	public static String checkSize (String string){
		String[] words = string.split("\\s+");
		
		if(words[0].toUpperCase().equals(words[0])
				&& words[1].toLowerCase().equals(words[1])){
			return "OK";
		}
		else
			return"NOT OK";
	}

}
