package lesson018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOrnek2 {

	public static void main(String[] args) {

		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
		int[] notlar = { 60, 80, 70 };

		// Hashmap --> neye sıralnıyor? --> Hashcodları hesaplanıyo ona göre
		// sıralnıyorlar
		// LinkedHashmap --> direkt referans tuttugu için
		// LinkedHasmap ve hashmap farkına bakalım
		// arka tarafta nasıl çalışıyorlar.

		// 1
		HashMap<String, Integer> map1 = new HashMap<>();
		for (int i = 0; i < notlar.length; i++) {
			map1.put(ogrenci[i], notlar[i]);
		}
		System.out.println(map1);
		for (Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("-------------------");

		// 2
		// her öğrencinin 3 notu olcak
		int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

		HashMap<String, int[]> map2 = new HashMap<>();
		for (int i = 0; i < notlar2.length; i++) {
			map2.put(ogrenci[i], notlar2[i]);
		}

		for (Entry<String, int[]> entry : map2.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i] + " ");
			}
		}

		// 3
		// Ayşe, notlarListesi
		// Ayşe, 50 50 60
		int[][] notlar3 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
		System.out.println("*****************");
		HashMap<String, List<Integer>> map3 = new HashMap<>();

		for (int i = 0; i < notlar3.length; i++) {
			List<Integer> listNotlar = new ArrayList<>();
			for (int j = 0; j < notlar3[i].length; j++) {
				listNotlar.add(notlar3[i][j]);
			}
			map3.put(ogrenci[i], listNotlar);
		}
		System.out.println(map3);
		for (Entry<String, List<Integer>> entry : map3.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
