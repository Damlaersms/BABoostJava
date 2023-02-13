package lesson007;

import java.util.Scanner;

public class Question059 {

	private static int kacBasamakli(int x) {
		String sayi = String.valueOf(x);
		int basamak = sayi.length();
		return basamak;
	}

	public static void bindenBuyukMu(int x) {
		int sayiniUzunlugu = kacBasamakli(x);
		if (sayiniUzunlugu >= 4) {
			System.out.println("sayi 1000 den büyüktür veya eşit");
		} else {
			System.out.println("sayi 1000 den büyüktür");
		}
	}

	public static void main(String[] args) {
		// parametre olarak int alan ve int döndüren
		// girilen sayının kaç basamaklı oldugunu bulan methodu yzalım
		// 1000 -->string -->length

		// daha sonra farklı bir method yazalım

		// sayının 1000den büyük olup olmadıgını kontrol edelim
		// "1000" --> length 4 ten büyükse 1000 den büyük

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		// 1000
		bindenBuyukMu(sayi);

	}

}
