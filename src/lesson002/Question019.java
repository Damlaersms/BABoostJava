package lesson002;
import java.util.Scanner;
public class Question019 {

	public static void main(String[] args) {
		// girilen karakterin ünlü mü ünsüz mü olduğunu bulan program
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter giriniz: ");
		char karakter = scanner.next().charAt(0);
		int ascii = karakter;
		switch (karakter) {
		case 65,69,73,79,85,97,101,105,111,117:
	
			System.out.println("ünlü harf");
			break;
		
		default:
			System.out.println("ünlü değil");
			break;
		}
		
	}

}
