package lesson006;

import java.util.Scanner;

public class Question048 {

	public static void main(String[] args) {
		// 2x2 tipinde bir array oluşturalım
		//bu arrayin içine isimler yazdırcaz.
		//isimleri kullanıcıdan alıcaz
		//çıktı olarak
		
		//1. grup
		//ali
		//mehmet
		
		//2. grup
		//ahmet
		//hakan
		String [][] array = new String[2][2];
 		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(i+1 + ". grup üyelerini giriniz: ");
				array[i][j] = scanner.nextLine();
			}
			System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+1 + ". grup");
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		
	}

}
