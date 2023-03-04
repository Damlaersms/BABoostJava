package lesson016.InterfaceUygulama;

import java.util.Scanner;

public class Util {
	
static Scanner scanner = new Scanner(System.in);
	
	public static int intDegeAl(String sorgu) {
		System.out.println(sorgu);
		int deger = Integer.valueOf(scanner.nextLine());
		return deger;
	}
	
	public static String stringDegerAl(String sorgu) {
		System.out.println(sorgu);
		String deger = scanner.nextLine();
		return deger;
	}

}
