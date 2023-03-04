package lesson017;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek2 {
	
public static void main(String[] args) {
		
		
		//1 tane çift sayılar
		//1 tane teksayılar arraylisti açalım
		
		//1 den 100 e kadar 35 tane random sayı üretelim
		//üretilen sayılardan tekleri tekArrayListine
		//çiftleride çiftArraylistine atlaım
		
		ArrayList<Integer> tekSayiler = new ArrayList<>();
		ArrayList<Integer> ciftSayilar = new ArrayList<>();
		
		for (int i = 0; i < 35; i++) {
			Random random = new Random();
			int sayi = random.nextInt(0,101);
			if(sayi%2 ==0) {
				ciftSayilar.add(sayi);
			}else {
				tekSayiler.add(sayi);
			}
		}
		
		System.out.println("çiftler");
		for (Integer integer : ciftSayilar) {
			System.out.print(integer +",");
		}
		System.out.println();
		System.out.println("tekler");
		for (Integer integer : tekSayiler) {
			System.out.print(integer +",");
		}
	}

}
