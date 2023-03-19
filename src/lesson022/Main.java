package lesson022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
public static void main(String[] args) {
		
		
		Kisi kisi1 = new Kisi("ahmet",51,ECinsiyet.ERKEK,1000);
		Kisi kisi2 = new Kisi("ali",25,ECinsiyet.ERKEK,5000);
		Kisi kisi3 = new Kisi("zeynep",18,ECinsiyet.KADIN,1000);
		Kisi kisi4 = new Kisi("defne",15,ECinsiyet.KADIN,1000);
		Kisi kisi5 = new Kisi("aslı",32,ECinsiyet.KADIN,2000);
		
		List<Kisi> kisiler = new ArrayList<>();
		
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		
		//Kadın olanları farklı bir listeye atalım
//		System.out.println("Kadınlar");
//		List<Kisi> kadinlar = kisiler.stream()
//				.filter(kisi-> kisi.getCinsiyet().equals(ECinsiyet.KADIN))
//				.collect(Collectors.toList());
//		System.out.println(kadinlar);
		
		//Kİşileri yaşlarına göre sıralayalım
		//google araştıralım stream api sıralama nasıl yapılır
		
		//collections.sort(persons, Comparator.comparing(Person::getFname)
		//how to sort age in stream api
		
//		 people.stream()
//         .sorted(Comparator.comparing(byAge).thenComparing(byTheirName))
//         .collect(Collectors.toList());
//		
		//Strem olmadan
		Collections.sort(kisiler, Comparator.comparing(Kisi::getSalary)
						.thenComparingInt(Kisi::getAge).reversed());
		System.out.println(kisiler);
		
		//Stream ile
//		List<Kisi> sortedList = kisiler.stream()
//				.sorted(Comparator.comparing(Kisi::getAge).reversed())
//				.collect(Collectors.toList());
//		sortedList.forEach(System.out::println);
		
		
		//isim ve age degerlini bir hashmap yapısına atalım
		
		Map<String, Integer> kisiMap = kisiler.stream()
				.collect(Collectors.toMap(kisi-> kisi.getName(), kisi->kisi.getAge()));
		kisiMap.forEach((key,value) -> System.out.println(key + " " + value));
	}

}
