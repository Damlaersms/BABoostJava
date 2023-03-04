package lesson016.InterfaceUygulama;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane implements IKutuphaneManager{
	
	private String name;
	private List<Kitap> kitapListesi;
	private List<Kitap> indirimdekiKitaplar;

	public Kutuphane(String name) {
		super();
		this.name = name;
		this.kitapListesi = new ArrayList<>();
		this.indirimdekiKitaplar = new ArrayList<>();
		System.out.println("Kütüphane oluştu");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}
	

	public List<Kitap> getIndirimdekiKitaplar() {
		return indirimdekiKitaplar;
	}

	@Override
	public void kitapEkle() {
		String isim = Util.stringDegerAl("Lütfen Kitap İsmini Girin");
		String yazar = Util.stringDegerAl("Lütfen Yazar İsmini Girin");
		int fiyat = Util.intDegeAl("Lütfen Kitabın Fiyatını Girin");

		Kitap kitap = new Kitap(isim, yazar, fiyat);
		kitapListesi.add(kitap);
		System.out.println(isim + " Kütüphaneye eklendi");
	}
	@Override
	public void kitaplariListele() {
		for (Kitap kitap : kitapListesi) {
			System.out.println("İsim: " + kitap.getIsim() + "Fiyati: " + kitap.getFiyat());
		}
	}
	@Override
	public void yazarIsmıneGoreArama() {
		String yazar = Util.stringDegerAl("Lütfen Yazar İsmini Girin");
		for (Kitap kitap : kitapListesi) {
			if (kitap.getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(kitap.getIsim());
			}
		}
	}
	public void yazarIsmıneGoreAramaAlternatif() {
		String yazar = Util.stringDegerAl("Lütfen Yazar İsmini Girin");
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(kitapListesi.get(i).getIsim());
			}
		}
	}

	public void kitapSil() {
		String isim = Util.stringDegerAl("Lütfen Kitap İsmini Girin");
		Kitap kitap = kontrol(isim);
		if (kitap != null) {
			kitapListesi.remove(kitap);
			System.out.println("Başarıyla silindi");
		}
	}

	public void indirimUygula() {
		String kitapIsmi = Util.stringDegerAl("İndirim uygulanacak Kitap İsmini Girin");
		int indirim = Util.intDegeAl("Lütfen indirm miktari uygulayın");
		Kitap kitap = kontrol(kitapIsmi);
		if (kitap != null) {
			kitap.setFiyat(kitap.getFiyat() - indirim);
			System.out.println("Güncel Fiyatı--> " + kitap.getFiyat());
			getIndirimdekiKitaplar().add(kitap);
			//kitap.setIndirimdeMi(true);
		}
	}

	// 0 1 2
	// kitap2, kitap1, kitap3
	private Kitap kontrol(String name) {
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getIsim().equalsIgnoreCase(name)) {
				return kitapListesi.get(i);
			}
		}
		System.out.println("Kitap bulunamamıştır");
		return null;
	}

	
	public void kitabiGuncelle() {
		String isim = Util.stringDegerAl("Değiştirmek istediğiniz kitabın adını girin: ");
		Kitap kitap = kontrol(isim);
		if (kitap != null) {
			String guncelIsım = Util.stringDegerAl("Güncellemek istediğiniz ismi girin: ");
			kitap.setIsim(guncelIsım);
			System.out.println("Güncel İsmi--> " + kitap.getIsim());
		}
	}

	
	public void indirimdekiKitaplariGoster() {
		System.out.println("indirimdeki kitaplar ");
		for (Kitap kitap : indirimdekiKitaplar) {
			System.out.println(kitap.getIsim());
		}
	}
	
	public void indirimdekiKitaplariGosterAlternatif() {
		System.out.println("indirimdeki kitaplar ");
		for (Kitap kitap : kitapListesi) {
			if (kitap.isIndirimdeMi()) {
				System.out.println(kitap.getIsim());
			}
		}
	}

}
