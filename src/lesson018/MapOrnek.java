package lesson018;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOrnek {

	public static void main(String[] args) {

		/*
		 * character ve int tutan bi map oluşturalım kullanıcıdan bir klime alalım ve
		 * girilen kelimede hangi harften kaç tane var onu yazdıralım
		 * 
		 * selamm 
		 * s-1 
		 * e-1 
		 * m-2 
		 * gibi...
		 */

		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime girin:");
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);
            if (hashMap.containsKey(harf)) {
                int sayi = hashMap.get(harf);
                hashMap.put(harf, sayi + 1);
            } else {
                hashMap.put(harf, 1);
            }
        }

        for (char harf : hashMap.keySet()) {
            int sayi = hashMap.get(harf);
            System.out.println(harf + " - " + sayi);
        }

	}

}
