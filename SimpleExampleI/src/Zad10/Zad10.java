package Zad10;

import java.util.Random;

public class Zad10 {

	/*
	 * Wygeneruj tablicê dwuwymiarow¹ (AxA) i wyznacz œredni¹ arytmetyczn¹
	 * ka¿dego wiersza osobno.
	 */
	public static void main(String[] args) {
		int[][] array = generateArray(4, 2);
		printArray(array);
		averageEachLine(array);
	}

	public static int[][] generateArray(int x, int y) {
		int[][] array = new int[x][y];
		Random r = new Random();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array[i][j] = r.nextInt(20) - 10;
			}
		}
		return array;
	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void averageEachLine(int[][] array) {
		int sum = 0;
		double count = 0;
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			count = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			
			}
			System.out.print("\nSum of line " + (i + 1) + " is: " + sum);
			System.out.print(" Average: " + (sum / count) );
		}
	}
}
