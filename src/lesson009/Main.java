package lesson009;

public class Main {

	public static void main(String[] args) {

		
		// Soru bir dizide tekrar eden ilk sayıyı bulan ve ekrana yazdıran bir program
				// yazınız.

				int sayiDizisi[] = { 13, 7, 5, 4, 7, 3, 3, 3, 3 };
				int tekrarSayisi = 0;
				boolean kontrol = false;

				for (int i = 0; i < sayiDizisi.length; i++) {
					tekrarSayisi = 0;
					for (int j = 0; j < sayiDizisi.length; j++) {
						if (sayiDizisi[i] == sayiDizisi[j]) {
							tekrarSayisi++;
						}
					}
					if (tekrarSayisi > 1) {
						System.out.println(sayiDizisi[i] + " sayisi " + tekrarSayisi + " kez tekrar etmiş");
						kontrol = true;
					}
				}
				if (kontrol == false) {
					System.out.println("tekrar eden sayı bulunamamıstır");
				}
		
	}

}
