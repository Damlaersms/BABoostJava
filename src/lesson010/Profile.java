package lesson010;

public class Profile {

	//attribute, property, field
	
	//gerekli attribute'leri tanımlayalım
	//String "url"
	
	//nesne özellikleri:
	public String profilResmi;
	public String kullaniciAdi;
	public String isim;
	

	public int takipciSayisi;
	public int takipSayisi;
	public boolean maviTik;
	
	int postSayisi ;
	public String[] posts = new String[10];
	
	
	//post oluştur metodu
	//isim ==> post oluşturdu desin
	
	public String postOlustur(String posts) {
		String metin = isim + " Post Oluşturdu";
		this.postSayisi++;
		this.posts[postSayisi] = posts;
		
		//this:  bulunduğu sınıfı gösterir
		return metin;
	}
	
	// profilIsminiGuncelle metodu
	// method isim alıcak ve ismi güncelliycek
	
	public void profilIsminiGuncelle(String isim) {
		this.isim =isim;
	}
	
	//gelenIstegiKabulEt metodu
	//takipçi sayımız artacak
	
	public void gelenIstegiKabulEt() {
		this.takipciSayisi +=1;
		verifiedCheck();
	}
	
	
	public void kullaniciSil() {
		this.takipciSayisi--;
		verifiedCheck();
	}
	
	
	//takipci sayısı 5ten fazla ise kullanıcıya mavi tik verelim
	//maviTik
	
	public void verifiedCheck() {
		if(this.takipciSayisi> 5) {
			this.maviTik = true;
		}else {
			this.maviTik = false;
		}
	}

	
	
	//bilgileri göster metodu
	//username, takipçi sayımız, mavitik, postsayısı
	
	
	public String bilgileriGoster() {
		return "kullaniciAdi=" + kullaniciAdi + ", maviTik=" + maviTik + ", takipciSayisi=" + takipciSayisi
				+ ", postSayisi=" + postSayisi;
	}
	
	public void bilgileriGoster2() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Profile [kullaniciAdi=" + kullaniciAdi + ", maviTik=" + maviTik + ", takipciSayisi=" + takipciSayisi
				+ ", postSayisi=" + postSayisi + "]";
	}
	
	
	
}
