package lesson007;

public class Question058 {
	
	private static int toplayici(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	private static boolean ondanBuyukKontrol(int sayi) {
		if (sayi < 18) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
			// topla methodu yazalım

			// toplam sonucunu kontrol edelim
			// sayının 10 dan büyük olup olmadıgını bulalım

			// metot boolean değer dönsün
			// 18 den büyükse ve eşitse true
			// küçükse false

			int toplamSonuc = toplayici(5, 5);
			boolean kontrol = ondanBuyukKontrol(toplamSonuc);
			
			System.out.println(kontrol ? "Mekana girebilirsiniz" : " Mekana giremezsiniz");
			
			//16:07
			
//			if (kontrol) {
//				System.out.println("Mekana girebilirsiniz");
//			} else {
//				System.out.println("Mekana giremezsiniz");
//			}
		}

	}


