package lesson015.veteriner;

public class Main {

	public static void main(String[] args) {

		
			Hayvan hayvan = new Kedi("Beyaz", true, "2012", "Tekir");
			
			Kedi kedi = new Kedi("Boncuk", true, "2010", "Tekir");
			Kedi kedi2 = new Kedi("Şanslı", false, "2015", "VanKedsi");
			Kedi kedi3 = new Kedi("Beyaz", true, "2012", "Tekir");
			
			Kopek kopek = new Kopek("xyz", false, "2010", "Rot");
			Kopek kopek1 = new Kopek("sda", false, "2015", "Golden");
			Kopek kopek2 = new Kopek("psls", true, "2012", "terrier");
			
			//kedi.bilgileriGoster();
			//kopek.bilgileriGoster();
			
			//kedi.karneOlustur();
			//kopek.karneOlustur();
			
			//hayvan.karneOlustur();
			karneOlusturFarklıMethod(hayvan);
			karneOlusturFarklıMethod(kedi2);
			karneOlusturFarklıMethod(kopek2);
			
			Musteri musteri = new Musteri("Sıla", "1654654654", "Ankara");
			Musteri musteri2 = new Musteri("Berin", "1231234534", "İzmir");
			Veteriner veteriner = new Veteriner("Deniz", "1654654654", "Odtü","2020");
			Veteriner veteriner2 = new Veteriner("Kumsal", "123312213", "İTU","2020");
			musteri.hayvanEkle(kedi);
			musteri.hayvanEkle(kopek);
			musteri.hayvanEkle(kopek2);
			musteri.hayvanEkle(kedi3);
			musteri.bilgileriGoster();
			System.out.println("**************");
			musteri.hayvanlariListele();
			
			veteriner.musteriEkle(musteri);
			veteriner2.musteriEkle(musteri2);
			
			veteriner2.musteriGoster();
			
			System.out.println("**************");
			veteriner.emailGonder(musteri2);
			
		}
		
		public static void karneOlusturFarklıMethod(Hayvan hayvan) {
			hayvan.karneOlustur();
		}


		
		//kedi nesnesi oluşturdugumuzda kedinin türü otomatik olarak "Kedi olsun"
		//Kopek nesnesi oluşturdugumuzda kopek türü otomatik olarak "Kopek olsun"
		
		//Hayvan sınıfında 2 tane abstract method oluşturalım
		//bilgileri göster --> toStringmethodunu kullanalım
		//diğer methodda karneOlustur() --> cinsinin ve türünü alıp bize karne oluştursun
		
		//Ortak bir method yazalım gelen parametreye göre karne oluştursun.
		
		
		//Müşterilimizin hayvanları olabilir
		//Müşteri sınıfıdna bir arraylist oluşturalım

		//Hayvan ekle methodu yazalım
		//HayvanNesesni + musteriIsmi + "e eklendi"
		
		//hayvanlarıListele
		//Müşterinin sahip oludgu hayvanları listelicez
		
		//Veterinerler
		//Müşterileri olabilir
		//müşteri ekle methodu yazalım
		//veterinerlerin müşterilerini görüntüleyelim
		
		//müşterinin hayvanlarından kayıtlı olanları getirelim
		
	

}
