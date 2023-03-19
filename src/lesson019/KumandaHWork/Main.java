package lesson019.KumandaHWork;

import java.util.Scanner;

public class Main {

	static Televizyon tv;
	static Boolean tvAcikMi = false;
	static int sesSeviyesi = 8;
	static int anlikKanal;

	private static void menuGoster() {
		System.out.println("***MENU****");
		System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" + "2-- Televizyonu Aç\n" + "3-- Sesini Artır\n"
				+ "4--Sesini Azalt\n" + "5-- Kanal Değiştir\n" + "6-- Kanal Bilgisi Goster\n" + "7-- Televizyonu Kapat\n"
				+ "8-- Menüyü Goster\n");

	}

	public static void main(String[] args) {
		menuGoster();

		boolean check = true;
		while (check) {
			System.out.println("Seçiminiz (Menüyü Görmek için 8)");
			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				tvKurveKanallariOlustur();
				break;
			case 2:
				televizyonuAc();
				break;
			case 3:
				sesiniArtır();
				break;
			case 4:
				sesiniAzalt();
				break;
			case 5:
				kanalDegistir();
				break;
			case 6:
				kanalBilgisiniGoster();
				break;
			case 7:
				tvKapat();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				check = false;
				System.out.println("Çıkış");
				break;

			}
		}

	}

	private static void tvKapat() {

		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz zaten kapalıdır.");

		} else {
			tvAcikMi = true;
			System.out.println("Televizyonunuz kapatılmıştır.");
		}

	}

	private static void kanalBilgisiniGoster() {

		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz kapalıdır.");

		} else {
			System.out.println("Kanal Listesi: ");
			tv.kanalGoster1();
			tv.kanalGoster2();
			tv.kanalGoster3();
			tv.kanalGoster4();
			System.out.println("Açık olan kanal: ");
			switch (anlikKanal) {
			case 1:
				tv.kanalGoster1();
				anlikKanal = 1;
				break;
			case 2:
				tv.kanalGoster2();
				anlikKanal = 2;
				break;
			case 3:
				tv.kanalGoster3();
				anlikKanal = 3;
				break;
			case 4:
				tv.kanalGoster4();
				anlikKanal = 4;
				break;
			}

		}
	}

	private static void kanalDegistir() {

		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz kapalıdır.");

		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Hangi kanalı açmak istiyorsunuz?");
			anlikKanal = scanner.nextInt();

			switch (anlikKanal) {
			case 1:
				tv.kanalGoster1();
				anlikKanal = 1;
				break;
			case 2:
				tv.kanalGoster2();
				anlikKanal = 2;
				break;
			case 3:
				tv.kanalGoster3();
				anlikKanal = 3;
				break;
			case 4:
				tv.kanalGoster4();
				anlikKanal = 4;
				break;
			}
		}
	}

	private static void sesiniAzalt() {
		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz kapalıdır.");

		} else {
			sesSeviyesi--;
			System.out.println("Ses seviyesi: " + sesSeviyesi);
		}
	}

	private static void sesiniArtır() {
		if (tvAcikMi != false) {
			System.out.println("Televizyonunuz kapalıdır.");

		} else {
			sesSeviyesi++;
			System.out.println("Ses seviyesi: " + sesSeviyesi);
		}
	}
	
	private static void televizyonuAc() {
		if(tv != null) {
			System.out.println("Televizyon açıldı.");
			System.out.println(tv.getKanallar().get(0).getKanalAdi() + " kanalını izliyorsunuz.");
		}
		else {
			System.out.println("Önce televizyonu kurmalısınız.");
		}
	}

	private static void tvKurveKanallariOlustur() {

		if (tv == null) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Televizyonun markasını giriniz: ");
			String marka = scanner.nextLine();
			System.out.println("Boyutunu (inch olarak) giriniz: ");
			String boyut = scanner.nextLine();
			tv = new Televizyon(marka, boyut);
			System.out.println("Televizyonunuz kurulmuştur-->>" + " Tv markanız: " + tv.getMarka() + " | Tv boyutunuz: "
					+ tv.getBoyut());

			tvAcikMi = false;
			tv.kanallarıOlustur();

		} else {
			System.err.println("Televizyonunuz zaten kurulmuştur!");
		}

	}
}
