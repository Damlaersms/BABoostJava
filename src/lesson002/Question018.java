package lesson002;
import java.util.Scanner;
public class Question018 {

	public static void main(String[] args) {
		// girilen char değerinin alfabenin içinde var mı yok mu?
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter giriniz: ");
		char karakter = scanner.next().charAt(0);
		int ascii = karakter;
		if (ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122) {
			System.out.println("girilen karakter alfabetiktir");
		}
		else {
			System.out.println("girilen karakter alfabetik değildir.");
		}

	}

}
