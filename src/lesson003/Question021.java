package lesson003;
import java.util.Scanner;
public class Question021 {

	public static void main(String[] args) {
		
		
		//girilen sayıya kadar olan sayıların toplamını yazdıralım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int x = scanner.nextInt();
		int toplam =0;
		for(int i=1;i<=x;i++) {
			toplam =toplam+i;	
		}
		System.out.println(toplam);
	}

}
