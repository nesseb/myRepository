package Zad9;

import java.util.Random;

public class Zad9 {

	/*
	 * Wygeneruj tablicê dwuwymiarow¹ i zwiêksz wszystkie elementy
	 * tablicy nad przek¹tn¹ o œredni¹ arytmetyczn¹ elementów pod przek¹tn¹.
	 */
	public static void main(String[] args) {
		System.out.println("================="+"\nArray before" + "\n=================");
		double[][] array = generateArray(4,4);
		printArray(array);
		increaseTopArray(array, averageDownArray(array));
		System.out.println("================="+"\nArray after" + "\n=================");
		printArray(array);
	}

	public static double[][] generateArray(int x, int y) {
		double[][] array = new double[x][y];
		Random r = new Random();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array[i][j] = r.nextInt(21) - 10;

			}
		}
		return array;
	}

	public static void printArray(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static double averageDownArray(double[][] array) {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i > j) {
					sum += array[i][j];
					count ++;
				}
			}
		}
		return sum/count;
	}
	
	public static void increaseTopArray(double[][] array, double average){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i < j) {
					array[i][j] += average;
				}
			}
		}
	}

}
