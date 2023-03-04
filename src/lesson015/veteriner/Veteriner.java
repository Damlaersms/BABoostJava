package lesson015.veteriner;

import java.util.ArrayList;

public class Veteriner extends Insan {

	private String okul;
	private String calismaYili;
	private ArrayList<Musteri> musteriListesi;

	public Veteriner(String name, String tc, String okul, String calismaYili) {
		super(name, tc);
		this.okul = okul;
		this.calismaYili = calismaYili;
		musteriListesi = new ArrayList<>();
	}

	public String getOkul() {
		return okul;
	}

	public void setOkul(String okul) {
		this.okul = okul;
	}

	public String getCalismaYili() {
		return calismaYili;
	}

	public void setCalismaYili(String calismaYili) {
		this.calismaYili = calismaYili;
	}
	
	public void musteriEkle(Musteri musteri) {
		musteriListesi.add(musteri);
		System.out.println(getName() +" Veterinerine" + musteri.getName() + " Eklendi");
	}
	
	public void musteriGoster() {
		System.out.println(getName() + "in müşterileri");
		for (Musteri musteri : musteriListesi) {
			System.out.println(musteri.getName());
		}
	}
	
	public void emailGonder(Musteri musteri) {
		for (Hayvan hayvan : musteri.getHayvanListesi()) {
			if(hayvan.isKayitliMi()) {
				System.out.println(hayvan.getName());
			}else {
				System.out.println(hayvan.getName() +"İsimli hayvanı kayıt ettirin");
			}
		}
	}
	
	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return super.toString() + " Veteriner [okul=" + okul + ", calismaYili=" + calismaYili + "]";
	}

}
