package lesson004;

import java.util.Scanner;

public class Question039 {

	public static void main(String[] args) {
		//

		//          Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin
		// için de o 
		//         harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		//         eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		//         2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz
		// harfi
		//           giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer
		// kelimemiz
		//           içerisinde o harf varsa değiştirsin.
		//         3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom
		// olup
		//          * olmadığını bulunuz(kek,iki,kabak,kayak)
		// sistemden çıksın.
		

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("=====String İşemleri=====");
			System.out.println("1-Harf Saydırma");
			System.out.println("2-Harf Değiştirme");
			System.out.println("3-Polindrom Kontrolu");
			System.out.println("4-kelimenin harflerinin arasına ? koy");//en sonuna koyma
			System.out.println("5-kelimenin ilk üç indexini alıp sonuna ... koyun");
			System.out.println("5-kelimenin ilk üç indexini alıp sonuna kalan harf sayısı kadar . koyun");
			System.out.println("Bir seçim yapınız!");
			int secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1:
				// ahmetm
				// m
				int sayac = 0;
				String indexler = "";
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime = scanner.nextLine();
				System.out.println("Hangi harfi saymak istiyosunuz ");
				String harf = scanner.nextLine();
				if (!kelime.contains(harf)) {
					System.out.println("Aradığınız harf kelimenin içinde yoktur");
				} else {
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							indexler += i + ",";
						}
					}
					
					System.out.println(harf + "harfi kelime içinde " + sayac + " adet bulunuyor.");
					System.out.println(harf + "değerinin indexleri ===>" + indexler.substring(0,indexler.length()-1));
//					harflerin idexi
//					for (int index = kelime.indexOf(harf);
//						     index >= 0;
//						     index = kelime.indexOf(harf, index+1))
//						{
//						    System.out.print(index + " ");
//						}
				}
				break;
			case 2:
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime2 = scanner.nextLine();
				System.out.println("Değiştirmek istediğiniz harf: ");
				String eskiHarf = scanner.nextLine();
				System.out.println("Hangi harf ile değiştirmek istiyorsunuz? : ");
				String yeniHarf = scanner.nextLine();
				if(kelime2.contains(eskiHarf)) {
					kelime2= kelime2.replace(eskiHarf, yeniHarf);
				}else {
					System.out.println(eskiHarf + " mevcut değil");
				}
				System.out.println(kelime2);
				break;
			case 3:
				System.out.println("Lütfen ters çevirmek istediğiniz kelimeyi giriniz: ");
				String duz = scanner.nextLine();
				String ters = "";
				int length = duz.length();
				for (int i = length-1; i>=0;i--) {
					ters = ters + duz.charAt(i);
				}
				System.out.println("Girilen kelimenin tersi: " + ters);
				if(duz.equals(ters)) {
					System.out.println("girilen kelime bir polindromdur.");
				}else {
					System.out.println("girilen kelime polindrom değildir.");
				}
				
				break;
			case 4:
				StringBuilder stringBuilder = new StringBuilder();
				System.out.println("kelime giriniz");
				String kelime4= scanner.nextLine();
				for(int i =0; i<kelime4.length(); i++) {
					stringBuilder.append(kelime4.charAt(i) + "?");
				}
				System.out.println(stringBuilder.toString());
				System.out.println(stringBuilder.substring(0,stringBuilder.length()-1));
				break;
			case 5:
				System.out.println("Lütfen kelimeyi giriniz: ");
				String kelime5 = scanner.nextLine();
				
				String kelime6 = kelime5.substring(0,3);
				String eklenecekSekil = "...";
				System.out.println(kelime6 + eklenecekSekil);
				break;
			case 6:
				System.out.println("Lütfen kelimeyi giriniz: ");
				String kelime7 = scanner.nextLine();
				String kelime8 = "";
				for(int i = 0; i<kelime7.length();i++) {
					if(i<3) {
						kelime8 += kelime7.charAt(i);
					}else {
						kelime8 += ".";
					}
					
				}
				System.out.println(kelime8);
				break;
			case 0:
				kontrol=false;
				System.err.println("çıkış yapıldı!!!");
				break;
			default:
				System.err.println("Geçerli bir sayı girin!!!");
				break;

			}
		}

	}

}
