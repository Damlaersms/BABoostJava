package lesson011;

public class Main {

	public static void main(String[] args) {
		//Product sınıfı oluşturalım
				//id, price, name, stock
				//bilgileriGoster methodu yazalım
				
				//değişkenler private
				//birde boş constructor
				
				//veritabanına kaydet --> ürün ismi + veritabanına kaydedildi
				//urunu Guncelle ->> ismini güncellicez paramatre olarak string name
				
				//Farklı paket açalım
				//o paketin içinde bir class oluşturup içinde random id oluşturcak bir metot yazalım
				//sonrada ben her product nesnesi ürettiğimde otomatik olarak
				//id si oluşmuş olsun
				

				//Sepet sınıfı oluşturalım
				//Array olarak products, totalprice
				
				//Sepete ürün ekle metotu yazalım
				//void, parametre --> Product tipinde bir parametre alsın
				//gelen productı arrayin içine atıcaz.
				
				Product product1 = new Product();
				product1.setName("asus");
				product1.setPrice(1500);
				product1.setStock(6);
				product1.bilgileriGoster();
				
				Product product2 = new Product("apple", 100, 2000);
				product2.bilgileriGoster();
				product2.ismiGuncelle("apple2");
				product2.bilgileriGoster();
				
			
				System.out.println("*****************");
				Sepet sepet1 = new Sepet();
				
				System.out.println(product1.isActive());
				System.out.println(product1.getStock());
				System.out.println(sepet1.getTotalPrice());
				sepet1.sepeteEkle(product1);
				sepet1.sepeteEkle(product1);
				sepet1.sepeteEkle(product2);
				sepet1.sepeteEkle(product1);
				sepet1.sepeteEkle(product2);
				System.out.println(sepet1.getTotalPrice());
				System.out.println(product1.isActive());

				
				System.out.println("*****************");
				
				

				System.out.println(product1.getStock());
				System.out.println(sepet1.getTotalPrice());
				
				System.out.println("*****************");
				Product product3 = new Product();
				System.out.println(product3.isActive());
				product3.setName("HP");
				product3.gosterimdenKaldir();
				System.out.println(product3.isActive());
				
				
				sepet1.sepettekiUrunleriGoster();
				
				

				

	}

}
