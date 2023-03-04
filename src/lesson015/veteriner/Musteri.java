package lesson015.veteriner;

import java.util.ArrayList;

public class Musteri extends Insan{
	
	private String adress;
	private ArrayList<Hayvan> hayvanListesi;

	public Musteri(String name, String tc, String adress) {
		super(name, tc);
		this.adress = adress;
		hayvanListesi = new ArrayList<Hayvan>();
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public ArrayList<Hayvan> getHayvanListesi() {
		return hayvanListesi;
	}

	public void setHayvanListesi(ArrayList<Hayvan> hayvanListesi) {
		this.hayvanListesi = hayvanListesi;
	}

	// max 3 hayvanı olabilir
	public void hayvanEkle(Hayvan hayvan) {
		if (hayvanListesi.size() < 3) {
			if (hayvanListesi.add(hayvan)) {
				System.out.println(hayvan.toString() + " " + getName() + "'e eklendi");
			}
		} else {
			System.out.println("max seviyede ");
		}
	}

	public void hayvanlariListele() {
		System.out.println(getName() + "in sahip oldugu hayvanlar");
		System.out.println(hayvanListesi.get(0).getName());
		System.out.println(hayvanListesi.get(1).getName());
		System.out.println(hayvanListesi.get(2).getName());
		System.out.println("**************");
		for (Hayvan hayvan : hayvanListesi) {
			// System.out.println(hayvan.getName());
			hayvan.bilgileriGoster();
		}
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return super.toString() + " Musteri [adress=" + adress + "]" + hayvanListesi;
	}


}
