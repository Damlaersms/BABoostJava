package lesson004;
import java.util.Scanner;
public class Question033 {

	public static void main(String[] args) {
		// girilen sayının mükemmel sayı olup olmadığını bulan program
		
		
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int toplam = 0;
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if(sayi == toplam) 
            System.out.println(sayi + " Mükemmel sayidir");
        
        else 
            System.out.println(sayi + " Mükemmel sayi degildir.");
        

	}

}
