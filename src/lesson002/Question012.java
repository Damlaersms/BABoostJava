package lesson002;

import java.util.Scanner;

public class Question012 {

	public static void main(String[] args) {
		//****int olarak
				//dışarıdan iki tane sayısal değer alalım
				//iki sayının toplamı çift ise true değilse false yazdıralım
				//en sonunda sayıların toplamının yarısını yazdıralım.
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Lütfen iki sayı giriniz.");
				int x = scanner.nextInt();
				int y= scanner.nextInt();
				double z = x+y;
				double t = z/2;
				boolean tekMi;
				if(z%2==0) {
					tekMi =true;
				}
				else {
						tekMi= false;
				}
				System.out.println(tekMi);
				System.out.println(z/2);
				
				//if kullanmadan boolean çözüm
				boolean durum = (z%2==0);
				System.out.println(durum);
				System.out.println(z/2);
	}

}
