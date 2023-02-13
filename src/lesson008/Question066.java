package lesson008;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Question066 {

	
	public static int[] sayiUret() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("dizi uzunluğu: ");
		int uzunluk = scanner.nextInt();
		
		int [] array = new int[uzunluk];
		int[] toplam = new int[0];
		for (int i=0;i<array.length;i++) {
			Random random = new Random();
			array[i] = random.nextInt(1,500);
			System.out.println(array[i]);
		}
		
		return array;
	}
	
	public static double ortalamaHesapla(int[] array) {
		double toplam = 0;
		double ortalama =0;
		for (int i =0; i<array.length;i++) {
			toplam += array[i];
		}
		ortalama = toplam/ array.length;
		return ortalama;
	}
	public static void main(String[] args) {
		// randomSayiUret metodu yazalım burda 1den 500 e kadar random sayı üretcez
		//ortalama hesapla diye bir metod yazalım
		
		//kullanıcıdan kaç tane sayıyla işlem yapmasını istediğimizi soralım
		//girdiği veriye göre içerde bir array oluşturcaz ve random üretilen sayıları bu arreye
		//atıcaz daha sonra ort bulcaz
		
		int[] array = sayiUret();
		System.out.println("ortalama : " + ortalamaHesapla(array));;

	}

}
