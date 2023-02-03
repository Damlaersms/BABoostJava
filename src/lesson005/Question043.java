package lesson005;

public class Question043 {

	public static void main(String[] args) {
		// bu sayı çifttir veya bu sayı tektir şeklinde çıktı alan ve
		//dizideki tüm sayıların toplamını veren prog
		
		
		
		int[] sayilar = { 2,4,10,5 };

		int toplam = 0;
		for (int i=0; i<sayilar.length; i++) {
			if (sayilar[i] % 2==0) {
				System.out.println(sayilar[i] + " çifttir.");
			
			}else {
				System.out.println(sayilar[i] + " tektir.");
			
			}
		toplam = toplam+ sayilar[i];
		}
		System.out.println(toplam);
	}

}
