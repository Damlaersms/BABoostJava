package lesson003;
import java.util.Scanner;
public class Question026 {

	public static void main(String[] args) {
		
		//girilen sayının asal olup olmadığı
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal sayidir.");
        }
        else {
            System.out.println(sayi + " Asal sayi degildir.");
        }

	}

}
