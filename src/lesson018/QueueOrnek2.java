package lesson018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	public static void main(String[] args) throws InterruptedException {

	/*
	 	Bir tane queue oluşturalım
		10-12 tane isim queue'ya
		daha sonra 1-10 arasın bir sayı üretcez bu sayi bizim pide sayımız
		pide yazdıralım
		kuyruga göre pideleri dağıtıcaz pideler bittiğinde pideler bitti yazdıralım
		pideyi alan kişileri kuyruktan çıkarcaz
		pideyi alamayan kişileir yazdıralım
	 */
		Random random = new Random();
		int pide = random.nextInt(1,10);
		
		Queue<String> isimler = new LinkedList<>();
		isimler.offer("damla");
		isimler.offer("hivda");
		isimler.offer("ayşe");
		isimler.offer("sinem");
		isimler.offer("gülsu");
		isimler.offer("merve");
		isimler.offer("uğur");
		isimler.offer("mustafa");
		isimler.offer("onur");
		isimler.offer("yasin");
		isimler.offer("ahmet");
		
		System.out.println("Pide alanlar:");
		for(int i=0;i<=pide;i++) {
			System.out.println(isimler.poll() + " pide aldı");
			Thread.sleep(1000);
		}
		System.out.println("\n***********************************");
		System.out.println("\nPide alamayanlar:");
		while(!isimler.isEmpty()){
			
			
			System.out.println(isimler.poll());
		}
	
		
	}

}
