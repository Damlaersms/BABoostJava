package lesson008;

import java.util.Scanner;

public class Question061 {

	
	public static int yasHesapla(int dogumTarihi) {
		int yas = 2023- dogumTarihi;
		return yas;
	}
//*******************************************************************
	public static int yuzYilHesapla(int dogumTarihi) {
		int yuzYil = dogumTarihi/100+1;
		return yuzYil;
	}
//*******************************************************************
	public static void bilgileriYazdir(int dogumTarihi) {
		int yas = yasHesapla(dogumTarihi);
		int hesaplanmisYuzYil = yuzYilHesapla(dogumTarihi);
		System.out.println("Yaşınız: " + yas + " kaçıncı yüzyıl: " + hesaplanmisYuzYil);
	}
//*******************************************************************
	public static void bilgileriYazdir2() {
		Scanner scanner = new Scanner(System.in);
		int dogumYili = scanner.nextInt();
		
		int yas = yasHesapla(dogumYili);
		int hesaplanmısYuzYil = yuzYilHesapla(dogumYili);
		
		System.out.println("Yaşınız: " + yas + "Kçaıncı yüzyıl " + hesaplanmısYuzYil);
	}
//*******************************************************************
	public static void main(String[] args) {
		
		// doğum yılınızı girerek yaşınızı ve
		//hangi yüzyılda doğduğunu hesaplayan metotları yazalım.
		//
		//3 farklı metot yazıcaz
		//yashesapla
		//yuzyıl hesapla
		//bilgileriyazdır
		
		//bilgileriYazdir(1992);
		//hangi yüzyılda hem de yasini söylicek
		
		bilgileriYazdir(1998);
		bilgileriYazdir2();
		
	}

}
