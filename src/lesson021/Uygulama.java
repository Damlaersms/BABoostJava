package lesson021;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

//1- bir yuk yeri seçme metodumuz olsun
//bu metot limandali yükler arayinden bi yer belirlesin kendine
//eğer mevcut sınırdan fazla ise hata fırlatalım

//2- Kendi exception sınıfımızı yaratalım
//LimanAppExcepion, Daha sonra seçtiğimiz yer null değilse hata fırlatcaz
//kendi yazdığımız exception sınfımızı throw edicez

//3-Hata mesajları için Enum Sınıfı oluşturalım
//ErrorType--> hata mesajının kodu, mesaj kısmı olsun

//4- Ağırlık belirle methodu --> limanımız 100 kilo altı yükleri kabul etmesin
//excepiton fırlatcaz
//double dönsün

//5- limanımız cuma ürün kabul etmiyoruz

//6- yukOlustur methodu yazalım
//

public class Uygulama {
	
	// hibernate
		// Dependency Injection
		// Spring boot
		
		//veribanı, postgreSQL, sql
		//JDBC
		//Hibernate
		//html css, react
		//spring boot
		//react
		
		// 30 tane heapte static için yer ayrıldı

		// Uygulama nesnesi oluşur
		Liman liman;

		public Uygulama() {
			this.liman = new Liman();
		}

		static Scanner scanner = new Scanner(System.in);

		public void yukYeriSec() {
			System.out.println("Lütfen bi yük yeri seçin");
			int index = scanner.nextInt();
			try {
				Yuk yuk = liman.getYukler()[index];
			} catch (Exception e) {
				System.out.println("Lütfen sınırları dahilinde bir yer seçiniz");
			}
		}

		// 0 ile yukler arayimiz kadar bu aralıkta bir yer seçmemiz için ovverride
		// edelim
		// int değer dösün index

		public int yukYeriSec2() {
			liman.getYukler()[0] = new Yuk("1 palet kıyafet", 150, LocalDate.now());
			int index = Util.intDegerAlma("Lütfen Yük yeri seçin");

			if (index < 0 || index >= liman.getYukler().length) {
				throw new LimanAppException(EErrorType.OUT_OF_BOUNDS);

			} else if (liman.getYukler()[index] != null) {
				throw new LimanAppException(EErrorType.SEAT_ALREADY_OCCPUIED);
			}
			return index;
		}

		public double agirlikAl() {
			double weight = Util.doubleDegerAlma("Yükünüzün agırlıgını giriniz: ");
			if (weight < 100) {
				throw new LimanAppException(EErrorType.TOO_LOW_WEIGHT);
			}
			return weight;
		}

		public LocalDate kabulTarihiKontrol() {
			// Geçmişteki bir tarih aldıgımızda hata fırlatmamız lazım
			LocalDate date = Util.stringTarih();

			if (date.isBefore(LocalDate.now())) {
				throw new LimanAppException(EErrorType.EXPIRED_DATE);

			} else if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
				throw new LimanAppException(EErrorType.OUT_OF_SHIFT_DAY);
			}
			return date;
		}

		public void yukOlustur() {
			Yuk yuk = null;
			int index = 0;
			try {
				index = yukYeriSec2();
				String name = Util.stringDegerAl("Yük ismi: ");
				double agirlik = agirlikAl();
				LocalDate date = kabulTarihiKontrol();
				yuk = new Yuk(name, agirlik, date);

				liman.getYukler()[index] = yuk;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				if (yuk == null) {
					System.out.println("Yükünüz Kabul edilmedi");
				} else {
					System.out.println("Yukunuz kabul oldu " + index + " nolu yere yerleşti");
				}
			}
		}

		public static void main(String[] args) {
			Uygulama uygulama = new Uygulama();
//			try {
//				uygulama.yukYeriSec2();
//				uygulama.agirlikAl();
//				uygulama.kabulTarihiKontrol();
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
			//overEngineering
			//Keep it simple
			//Simple is the best
			uygulama.yukOlustur();
		}

}
