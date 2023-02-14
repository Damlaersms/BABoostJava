package maratonExam01;

import java.util.Scanner;

public class AnswerToQuestion04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("***************************");
			System.out.println("*  Geometrik Hesaplayıcı  *");
			System.out.println("***************************");
			System.out.println("1. Kare Alan Hesaplama");
			System.out.println("2. Kare çevre Hesaplama");
			System.out.println("3. Dikdörtgen Alan Hesaplama");
			System.out.println("4. Dikdörtgen Çevre Hesaplama");
			System.out.println("5. Daire Alan Hesaplama");
			System.out.println("6. Daire Çevre Hesaplama");
			System.out.println("7. ÇIKIŞ");
			System.out.println("Bir seçim yapınız!");
			int num = scanner.nextInt();
			scanner.nextLine();
			
		switch (num) {
		case 1:
			System.out.println("Karenin bir kenarının uzunluğunu giriniz: ");
			double kareKenar = scanner.nextDouble();
			double kareAlan = kareKenar * kareKenar;
			System.out.println("Karenin alanı : " + kareAlan);
			
			break;
		case 2:
			System.out.println("Karenin bir kenarının uzunluğunu giriniz: ");
			double kareKenar1 = scanner.nextDouble();
			double kareCevre = kareKenar1 *4;
			System.out.println("Karenin çevresi : " + kareCevre);
			
			break;	
		case 3:
			System.out.println("Dikdörtgenin kısa ve uzun kenarlarının uzunluğunu giriniz: ");
			double dikKenar1 = scanner.nextDouble();
			double dikKenar2 = scanner.nextDouble();
			double dikAlan = dikKenar1 *dikKenar2;
			System.out.println("Dikdörtgenin alanı : " + dikAlan);
			break;
		case 4:
			System.out.println("Dikdörtgenin kısa ve uzun kenarlarının uzunluğunu giriniz: ");
			double dikKenar3 = scanner.nextDouble();
			double dikKenar4 = scanner.nextDouble();
			double dikCevre = (dikKenar3+dikKenar4)*2;
			System.out.println("Dikdörtgenin çevresi : " + dikCevre);
			break;
		case 5:
			System.out.println("Dairenin yarıçap uzunluğunu giriniz: ");
			double r = scanner.nextDouble();
			double PI = Math.PI;
			double daireAlan = PI*r*r;
			System.out.println("Dairenin alanı : " + daireAlan);
			break;
		case 6:
			System.out.println("Dairenin yarıçap uzunluğunu giriniz: ");
			double r1 = scanner.nextDouble();
			double Pi = Math.PI;
			double daireCevre = 2*Pi*r1;
			System.out.println("Dairenin çevresi : "  + daireCevre);
			break;
		case 7:
			kontrol=false;
			System.err.println("ÇIKIŞ!!!");
			break;

		default:
			System.err.println("Geçerli bir sayı girin!!!");
			break;
		}
			}

		}

	}

