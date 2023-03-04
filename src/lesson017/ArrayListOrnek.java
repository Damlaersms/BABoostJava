package lesson017;

import java.util.ArrayList;

public class ArrayListOrnek {

	public static void main(String[] args) {

		// Bir tane array list oluşturalım
		// bu arraylistin içine manuel şehir atalım
		// buşehirlerden an ile başlayan varsa
		// bu şehri "xxx";

		ArrayList<String> ulkeSehirleri = new ArrayList<>();
		ulkeSehirleri.add("izmir");
		ulkeSehirleri.add("istanbul");
		ulkeSehirleri.add("Ankaraan");
		ulkeSehirleri.add("bursa");
		ulkeSehirleri.add("bodrum");

		degerDegistirme3(ulkeSehirleri);
		System.out.println("********");
		System.out.println(ulkeSehirleri);

	}
	public static void degerDegistirme2(ArrayList<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			if (sehirler.get(i).toLowerCase().startsWith("an")) {
				sehirler.set(i, "xxx");
			}
		}
	}
	
	public static void degerDegistirme3(ArrayList<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			String deger = sehirler.get(i);
			if(deger.toLowerCase().startsWith("an")) {
				deger = deger.toLowerCase().replace("an", "*");
				System.out.println(deger);
			}
		}
	}

	public static void degerDegistirme(ArrayList<String> sehirler) {
		for (String sehir : sehirler) {
			if (sehir.toLowerCase().startsWith("an")) {
				sehir = "xxx";
			}
			System.out.println(sehir);
		}
	}
}
