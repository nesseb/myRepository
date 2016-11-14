package cipher;

import java.util.Scanner;

public class VigenereCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert word:");
		String text = sc.nextLine();
		System.out.println("Insert key:");
		String key = sc.nextLine();
		sc.close();
		String encrypt = encrypt(text, key);
		System.out.println("encrypt: " + encrypt);
		System.out.println("decrypt: " + decrypt(encrypt, key));

	}

	public static String encrypt(String text, String key) {
		String cText = "";
		text = text.toUpperCase();

		for (int i = 0, j = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c < 'A' || c > 'Z')
				continue;

			cText += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
			j = ++j % key.length();

		}
		return cText;
	}

	public static String decrypt(String text, final String key) {
		String dText = "";
		text = text.toUpperCase();
		for (int i = 0, j = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c < 'A' || c > 'Z')
				continue;

			dText += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
			j = ++j % key.length();
		}
		return dText;
	}
}
