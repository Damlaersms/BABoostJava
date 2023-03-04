package lesson016.InterfaceUygulama;

public class Main {
	
	static Kutuphane kutuphane = new Kutuphane("Milli Kütüphane");
	
	public static void main(String[] args) {
		
		// Kitap sınıfımız olsun
				// isim, yazar, fiyat

				// Kutuphane
				// isim, Kitaplar

				// IKutuphaneManager diye bir interface oluşturalım
				// interface kitapEkle methodu yazalım

				// Util Sınıfı oluşturalım
				// intDegerAl()
				// stringDegerAl()

				// Kullanıcdan aldıgımız isim yazar ve fiyala bir kitap nesnesi olluşturalım

				// kitaplarıListele--> isimini fiyatını görüntüleyelim

				// Yazar ismine göre arama yapalım
				// kullanıcdan yazar ismi alalım
				// Ahmet'in yazdıgı listelemek istiyorum

				// Kitap sil methodu yazalım
				// silmek istediğiniz kitabuın ismini girin
				// girdiği kitap varsa silsin
				// yoksa girdiğiniz kitap yoktur

				// indirim yap methodu
				// kitap ismini alalım
				// ne kadar indirim yapmak istiyoruz
				// alınan isimde bir kitap yoksa
				// kitap yoktur
				// kitabın fiyatının güncelliyelim
				// güncel fiyatını yazdıralım

				// kontrol diye bir method yazarız
				// kitap var mı yok mu onu bulur
				// varsa o kitabı bize return eder
				// yoksa bilgilendirir.

				// kitabı güncelle methodu yazalım

				// indirimde olanları gösterebiliriz

				adminMenu();
			}

			public static void adminMenu() {

				while (true) {
					System.out.println("1- Kitap Ekle");
					System.out.println("2- Bütün Kitapları Listele");
					System.out.println("3- Yazara Göre Arama Yap");
					System.out.println("4- Kitap Sil");
					System.out.println("5- İndirim Uygula");
					System.out.println("6- Kitap İsmini Güncelle");
					System.out.println("7- İndirimde olanları listele");
					int secim = Util.intDegeAl("Seçiminiz ?");
					switch (secim) {
					case 1:
						kutuphane.kitapEkle();
						break;
					case 2:
						kutuphane.kitaplariListele();
						break;
					case 3:
						kutuphane.yazarIsmıneGoreArama();
						break;
					case 4:
						kutuphane.kitapSil();
						break;
					case 5:
						kutuphane.indirimUygula();
						break;
					case 6:
						kutuphane.kitabiGuncelle();
						break;
					case 7:
						kutuphane.indirimdekiKitaplariGoster();
						break;
					default:
						break;
					}
				}
	}

}
