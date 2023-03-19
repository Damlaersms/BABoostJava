package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class StreamApiOrnek {
	
public static void main(String[] args) {
		
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(61);
		sayilar.add(55);
		sayilar.add(78);
		sayilar.add(42);
		sayilar.add(25);

		//5 ile bölünen sayıları bir listeye atalım ve listeyi yazdıralım StreamApi kullanalım
		//filtreleme işlemi --> filter
		
		List<Integer> sayilar2 = new ArrayList<>();
		sayilar.stream().forEach(sayi -> {
			if(sayi %5 ==0) {
				sayilar2.add(sayi);
			}
		});
		System.out.println(sayilar2);
		
		List<Integer> kalansizBolunenlerListesi = 
				sayilar.stream()
				.filter(sayi -> sayi %5==0)
				//.toList();
				.collect(Collectors.toList());
		System.out.println(kalansizBolunenlerListesi);
		
		
		//sayıların kendisi ile çarpıp yeni bir listeye atalım
		//map 
		List<Integer> karesiListesi = sayilar.stream() //Stream
				.map(sayi -> sayi * sayi) //Strem
				.collect(Collectors.toList()); //List
		karesiListesi.forEach(sayi -> System.out.println(sayi));
		
		//kaç tane 5 e bölünen sayı var onu bulalım
		long beseBolunen = sayilar.stream().filter(sayi-> sayi % 5==0).count();
		System.out.println(beseBolunen);
	}
	
	

}
