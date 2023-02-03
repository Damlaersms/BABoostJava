package lesson002;

import java.util.Scanner;

public class Question016 {

	public static void main(String[] args) {

		// kullanıcıdan alınan sayı haftanın hangi günü
		// haftaiçi mi haftasonu mu

		Scanner scanner = new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz: ");
		int gun = scanner.nextInt();
		switch (gun) {
		case 1:
			System.out.println("Bugün: PAZARTESİ");
			break;
		case 2:
			System.out.println("Bugün: SALI");
			break;
		case 3:
			System.out.println("Bugün: ÇARŞAMBA");
			break;
		case 4:
			System.out.println("Bugün: PERŞEMBE");
			break;
		case 5:
			System.out.println("Bugün: CUMA");
			break;
		case 6:
			System.out.println("Bugün: CUMARTESİ");
			break;
		case 7:
			System.out.println("Bugün: PAZAR");
			break;
		default:
			System.out.println("HATA");
			break;
		}
		switch (gun) {
		case 1,2,3,4,5:
	
			System.out.println("Haftaiçi");
			break;
		case 6,7:
		
			System.out.println("Haftasonu");
			break;
		default:
			System.out.println("HATA");
			break;
		}

	}

}
