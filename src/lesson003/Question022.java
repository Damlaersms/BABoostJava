package lesson003;
import java.util.Scanner;
public class Question022 {

	public static void main(String[] args) {
		
		//girilen sayı için çarpım tablosu
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("bir sayi giriniz: ");
		int x = scanner.nextInt();
		int carpim =1;
		for(int i=1;i<=x;i++) {
			carpim = x*i;
			System.out.println(x + "*" + i + "=" + (x * i) + " ");
		
		}
		
	}

}
