package lesson003;
import java.util.Scanner;
public class Question029 {

	public static void main(String[] args) {
		
		//girilen sayının 5in kuvveti olup olmadığı
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        if(Math.log(sayi)%Math.log(5)==0) {	
        	System.out.println("sayı 5in kuvvetidir");
        }else {
        System.out.println("sayı 5in kuvveti değildir");
        }
	}

}
