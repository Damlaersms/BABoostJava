package lesson022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPiOrnek2 {
	
	// User sınıfı oluşturalım
		// id ve name
		// tostring yazalım
		// bilgilerigoster methodu olsun
		// mainde users diye liste oluşturalım
		// bu listeye bi kaç tane user atalım

		public static void main(String[] args) {
			List<User> users = new ArrayList<>();
			users.add(new User("ahmet", 1));
			users.add(new User("aslı", 2));
			users.add(new User("aslı", 2));
			users.add(new User("zeynep", 4));
			users.add(new User("deniz", 5));
			users.add(new User("mehmet", 6));
			users.add(new User("ahmet", 1));

			// butun userların to string methodunu çağıralım
			users.forEach(user -> System.out.println(user.toString()));
			users.stream().forEach(user -> user.bilgileriGoster());

			// id si 3 ten büyük olanları bir listeye atalım
			// ve bu liste içindeki userların bilgileri goster methodunu yazdıralım
			System.out.println("****");
			List<User> uctenBuyukler = users.stream().filter(user -> user.getId() > 3).collect(Collectors.toList());

			uctenBuyukler.forEach(User::bilgileriGoster);

			// id si 3 ten küçük olanları Sete atalım
			System.out.println("3 ten küçükler SET");
			Set<User> uctenKucukler = users.stream() // Stream<User>
					.filter(user -> user.getId() < 3) // Stream<User> id si 3 ten küçük userler var
					.collect(Collectors.toSet()); // //Set<User> id si 3 ten küçük olanları tutuyo
			uctenKucukler.forEach(User::bilgileriGoster);

			System.out.println("***");

			// ismi ahmet olanları listeye atalım
			List<User> ahmetler = users.stream().filter(user -> user.getName().equals("ahmet")).toList();
			ahmetler.forEach(User::bilgileriGoster);

			//her bir user için yeni bir User nesnesi oluşturalım
			//parametre olarak id ve isimlerini alsınlar ve isimlerinin sonuna "!!" ekleyelim
			//yeni listede yazdıralım
			
			List<User> yeniUser = users.stream()
					.map(user-> new User(user.getName() +"!!", user.getId()))
					.collect(Collectors.toList());
			yeniUser.forEach(User::bilgileriGoster);
		}

}
