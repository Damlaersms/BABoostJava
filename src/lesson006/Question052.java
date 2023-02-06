package lesson006;

import java.util.Scanner;

public class Question052 {

	public static void main(String[] args) {
		// girilen herhangi bir metinde türkçe karakterleri
		//ing karaktere çeviriyoruz.
		//Şeydaağ
		//Seydaag
		
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter    = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir metin giriniz");
		String metin = scanner.nextLine();

		for (int i = 0; i < turkceKarakter.length; i++) {
			metin = metin.replace(turkceKarakter[i], ingilizceKarakter[i]);
		}

		System.out.println(metin);
	}

}
