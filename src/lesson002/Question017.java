package lesson002;
import java.util.Scanner;

public class Question017 {

	public static void main(String[] args) {
		//girilen karakterin ascii kodu
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter giriniz: ");
		char karakter = scanner.next().charAt(0);
		int ascii = karakter;
		System.out.println(ascii);
		
	}

}
