package lesson002;


import java.util.Scanner;

public class Question011 {

	public static void main(String[] args) {
		//Dairenin çevresini ve alanını hesaplayan prog
				// pi 3.14 olsun
				//yarıçap kullanıcıdan alınsın
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Lütfen yarıçap uzunluğunu giriniz.");
				double r = scanner.nextDouble();
			

				if (r<=0) {
					System.out.println("Lütfen sıfırdan büyük bir değer giriniz.");
				}else {
				double pi = 3.14d;
				double cevre = 2*pi*r;
				double alan = pi*r*r;
				System.out.println("Alan: " + alan + " Çevre: " + cevre);
				}
	}

}
