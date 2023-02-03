package lesson005;
import java.util.Scanner;
public class HWAnswersQuestion1 {

	public static void main(String[] args) {
		
		// soruda kaçları saymak istiyosak kullanıcıdan sayıları alalım.
		// 2 ve 4 ün kaç kere geçtiğini
		// hangisinin daha fazla olduğunu
		int[] sayilar = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dizinin içinden saydırmak istediğiniz iki sayı giriniz.");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int sayacx = 0;
		int sayacy = 0;
		for (int i=0; i<sayilar.length; i++) {
			if (sayilar[i]==x) {
				sayacx++;
			}else if(sayilar[i]==y){
				sayacy++;
			}	
		}
		System.out.println(sayacx + " tane " + x + " vardır.");
		System.out.println(sayacy + " tane " + y + " vardır.");
		if(sayacy>sayacx) {
			System.out.println(y + " daha fazladır.");
		}else if (sayacy < sayacx){
			System.out.println(x + " daha fazladır.");
		}else {
			System.out.println("Eşit sayıda vardır.");
		}
	}

}
