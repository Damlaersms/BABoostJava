package lesson003;

public class Question025 {

	public static void main(String[] args) {
		//1'den 100e kadar olan çift sayıların toplamının tek sayıların toplamına oranı
		
		double toplam1 =0;
		double toplam2 = 0;
		for(int i=1;i<=100;i++) {
			if (i%2==0) {
			toplam1 =toplam1+i;	
			}else {
				toplam2=toplam2+i;
			}
		}
		System.out.println((toplam1/toplam2));
	}

}
