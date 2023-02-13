package lesson007;

public class Question060 {

	public static void yazdir(int[] dizi) {
		for (int j = 0; j < dizi.length; j++) {
			if (dizi[j] != 0) {
				System.out.print(dizi[j] + " ");
			}
		}
	}

	public static int[] tekSayilariAta(int[][] dizi) {
		int[] tekSayilar = new int[dizi.length * dizi[0].length];
		int sayac = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if (dizi[i][j] % 2 != 0) {
					tekSayilar[sayac] = dizi[i][j];
					sayac++;
				}
			}
		}
		return tekSayilar;
	}

	public static void main(String[] args) {
		// 2 farklı method yazalım
		// parametre olarak dizi(array) aldıgı dizideki
		// tek elemanları farklı bir diziye atıcak metot ismi tekSayilariAta();

		// diğer metotta teksayıların oldugu diziyi ekrana yazdırcak
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };

		int[] tekler = tekSayilariAta(matris);
		yazdir(tekler);
	}

}
