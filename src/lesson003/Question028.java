package lesson003;
import java.util.Scanner;
public class Question028 {

	public static void main(String[] args) {
		
		
		//**** do-while & while ile girilen sayının basamaklarının toplamını bulalım
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir sayi giriniz: ");
//        int sayi = scan.nextInt();
//        int toplam=0;
//        do {
//        	toplam = toplam + sayi % 10;
//        	sayi = sayi / 10;
//		} while (sayi > 0);
//        
//        System.out.println(toplam);
       
        
        Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int toplam=0;
        while(sayi>0) {
        	toplam = toplam + sayi % 10;
        	sayi = sayi / 10;
        }
        System.out.println(toplam);
        
	}

}
