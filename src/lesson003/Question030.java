package lesson003;

import java.util.Scanner;

public class Question030 {

	public static void main(String[] args) {
		

		//kullanıcıdan sürekli sayı alıcaz
		//kullanıcı sıfıra basınca aldığımız sayıların çarpımını yazdırcaz.

		int sayi = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("sayi girin: ");
		int carpim = 1;
		while ((sayi = input.nextInt()) !=0) {
			carpim = carpim * sayi;
		}
		if(sayi==0) {
			System.out.println(carpim);
		}
		

	}

}
