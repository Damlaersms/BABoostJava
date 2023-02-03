package lesson005;

import java.util.Random;
import java.util.Scanner;

public class Question040 {

	public static void main(String[] args) {

		// random int sayı üretmemiz lazım
		// random sayıyı üreteleim 0 ile 100 arasında bunu yazdıralım

//		//1 ile 100 arasında bi sayı girin dediği için *100
//		//1 ile 10 olsaydı *10 dememiz gerekirdi
//		int rastgele = (int) (Math.random() *100);
//		System.out.println(rastgele);

		// sayı tahmin uygulaması yapalım
		// sürekli kullanıcıdan sayıyı tahmin etmesini istiycez
		// eğer kullanıcının girdiği sayı bulması gereken sayıdan az ise
		// tahmininizi yükseltin yazsın
		// fazla ise azaltın desin
		// doğruysa kaçıncı denemesinde bulduğunu söylesin

		Random rd = new Random();
		int sayi = rd.nextInt(101);
		int cevaplamaSayisi = 0;
		Scanner input = new Scanner(System.in);
		int cevap;
		boolean kontrol = true;
		while (kontrol == true) {

			System.out.println("0 ile 100 arasında bir sayı tahmin edin: ");
			cevap = input.nextInt();
			cevaplamaSayisi++;

			if (cevap == sayi) {
				System.out.println("bildiniz");
				kontrol = false;
			} else if (cevap < sayi) {
				System.out.println("daha yüksek bir sayı tahmin edin");
			} else if (cevap > sayi) {
				System.out.println("daha küçük bir sayı tahmin edin");
			}	
		}
		System.out.println(cevaplamaSayisi + " deneme yaptınız.");

	}

}
