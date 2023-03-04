package lesson015;

public class Main {

	public static void main(String[] args) {

		/*
		 * Mülakatta sorulur
		 * Abstract sınıflar ve interface farkı?
		 * 
		 * interfaceler aslında bir sınıfın nasıl davranacağını söyler.
		 * 
		 * interfacelerde gövdeli method yazılabilir mi?
		 */
		
		
		// Polymorphism ?

		// Polymophismin --> Bir nesnenin farklı nesnelerin referansını tutabilme
		// özelliği.
				
				
				Person person = new Person("Ahmet", "Yaz", 25);
				
				VipPerson vipPerson = new VipPerson("Mehmet", "Kış", 40, "55447788");
				
				NormalPerson normalPerson = new NormalPerson("Ali", "Sonbahar", 35, "22334455");
				
				showInfo(person);
				showInfo(vipPerson);
				showInfo(normalPerson);
	}
	public static void showInfo(Person person) {
		person.bilgileriGoster();
	}
}
