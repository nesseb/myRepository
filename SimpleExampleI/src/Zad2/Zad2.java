package Zad2;

import java.util.Scanner;

public class Zad2 {
	
	/*
	 * Pobierz od usera napis i zlicz ile jest w nim
	 * wystapien znaku rowniez pobranego os usera.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		System.out.println("Enter a sign");
		String sign = sc.nextLine();
		sc.close();
		
		System.out.println(signCount(string, sign));
	}
	public static int signCount(String string, String sign){
		
		int count = 0;
		
		for(char c : string.toCharArray()){
			if(sign.indexOf(c) >= 0){
				count++;
			}
		}
		return count;
	}
}

