package Zad1;

import java.util.Scanner;

public class Zad1 {
	
	/*
	 * Pobierz od usera napis i zlicz ile jest w nim samog�osek.
	 * Nast�pnie na ko�cu napisu dodaj tyle gwiazdek, ile zliczy�e� samog�osek.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String x = sc.nextLine();
		sc.close();
		
		System.out.println("Entered string: "+ x + " \nStar count: " + addStar(countVowel(x)));
	}
	
	public static int countVowel(String x){
		int count = 0;
		String vowel = "a�e�o�uyi";
		
		for(char c : x.toCharArray()){
			if(vowel.indexOf(c) >= 0){
				count++;
			}
		}
		return count;
	}
	
	public static String addStar(int count){
		String sign="";
		 
		for(int i = 0; i < count;i++){
			sign+="*";
		}
		return sign;
	}

}
