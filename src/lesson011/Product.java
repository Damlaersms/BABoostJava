package lesson011;

import lesson011.helper.RandomGenerateId;

public class Product {
	
	private String name;
	private String id;
	private int stock;
	private int price;
	private boolean isActive = true;

	// Overloading
	public Product() {
		// Bir sınıftan nesne ürettiğimizde arkada tarafta çalışan ilk metottur.
		this.id = RandomGenerateId.generateId();
	}

	public Product(String name, int stock, int price) {
		this.name = name;
		this.id = RandomGenerateId.generateId();
		this.stock = stock;
		this.price = price;
	}
	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("sıfırdan büyük birşey girin");
		} else {
			this.price = price;
		}
	}

	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", stock=" + stock + ", price=" + price + "]";
	}

	public void ismiGuncelle(String name) {
		System.out.println(this.name + " Ürününü ismi " + name + " olarak Güncellendi");
		setName(name);
	}

	public void veriTabanınaKayder() {
		System.out.println(getName() + " Veri tabanıana kaydedildi");
	}
	
	public void gosterimdenKaldir() {
		if(getStock() <= 0) {
			setActive(false);
			System.out.println(getName() + " Gosterimden kaldırıldı");
		}
	}

}
