package lesson010;

public class Main {

	public static void main(String[] args) {
		
		Profile profil1 = new Profile();
		profil1.profilResmi = "resim.png";
		profil1.isim = "mehmet";
		profil1.kullaniciAdi = "mehmet123";
		
//		System.out.println(profil1);  //referansını yazdırır.
		
		System.out.println(profil1.isim); //==> ismi yazar, frontendçi bu kodu kullandığında
		profil1.isim ="mehmet2";
		System.out.println(profil1.isim); // dinamik olarak değişmiş olur.
		
		
		
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postSayisi);
		
		System.out.println();
		
		System.out.println(profil1.isim);
		profil1.profilIsminiGuncelle("yasin");
		System.out.println(profil1.isim);
		
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.kullaniciSil();
		profil1.kullaniciSil();
		profil1.kullaniciSil();
		
		System.out.println(profil1.takipciSayisi);
		System.out.println(profil1.maviTik);
		
		System.out.println(profil1.bilgileriGoster());
	
		profil1.bilgileriGoster2();
		
		profil1.posts[0] ="resim3";  // String[] posts = {"resim3"}
		profil1.posts[1] ="resim4";
		profil1.posts[2] ="resim5";
		profil1.posts[3] ="resim6";
		
		for(int i =0; i<profil1.posts.length;i++) {
			if(profil1.posts[i] != null) {
			System.out.println(profil1.posts[i]);
			}
		}
		System.out.println();
		for (String post : profil1.posts) {
			if(post != null) {
				System.out.println(post);
			}
		}
	
		
		
		
	}

}
