package lesson017;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {

	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {

		// Parametre olarak String alan ve
		// girilen metnin her bir karakterini stackin içine atan bir method yazalım
		// method ismi plaindrom olsun

		// java
		// j
		// a
		// v
		// a

		// isPalindrom methodu
		// kelimemiz palindromsa true değilse false

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");

		String kelime = scanner.nextLine();
		palindrom(kelime);

		if (isPalindrom(kelime)) {
			System.out.println("palindrom");
		} else {
			System.out.println("palidnrom değil");
		}

	}

	public static void palindrom(String name) {
		for (int i = 0; i < name.length(); i++) {
			stack.push(name.charAt(i));
		}
		for (Character character : stack) {
			System.out.println(character);
		}
	}

	public static boolean isPalindrom(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true;
	}

}
