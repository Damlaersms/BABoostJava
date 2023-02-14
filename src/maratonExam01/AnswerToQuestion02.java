package maratonExam01;

public class AnswerToQuestion02 {

	
	public static int[] tekrarEdenSayiBul(int[] dizi0){
		int i = 0; 
		int j=0;
		int sayac = 1;
		int tekrarEdenSayi=0;

		while (i < dizi0.length) {
			j = i + 1;
			while (j < dizi0.length) {
				if (dizi0[i] == dizi0[j]) {
					sayac++;
					tekrarEdenSayi = dizi0[j];
					break;
				}
				j++;
			}
			i++;
		}
		
		if(sayac ==1) {
			System.out.println("Tekrar eden sayı yoktur.");
		}else {
		System.out.println(sayac + " tane " + tekrarEdenSayi + " vardır.");
		}
		return dizi0;
		
	}
	public static void main(String[] args) {
		int[] dizi = { 3, 15, 60, 8, 12, 10, 55, 60,60 };
		tekrarEdenSayiBul(dizi);
	}
}
