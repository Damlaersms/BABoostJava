package lesson003;

import java.util.Scanner;

public class Question031 {

	public static void main(String[] args) {
		// girilen sayıya kadar tek olan sayıların toplamı
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int x = scanner.nextInt();
		int toplam =0;
		for(int i=1;i<=x;i+=2) {
			
			toplam =toplam+i;	
			
		}
		System.out.println(toplam);

		
	}

}
