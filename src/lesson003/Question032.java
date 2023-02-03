package lesson003;
import java.util.Scanner;
public class Question032 {

	public static void main(String[] args) {
		// girilen sayıda hangi basamakta hangi sayı var
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int i=1;
		int sayi = scanner.nextInt();
		while (sayi > 0){  
			System.out.println(i + "ler basamağı: " + sayi % 10);
			sayi = sayi/10; 
			i =i*10;
		}

	}

}
