package lesson018;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek3 {

	public static void main(String[] args) {
		
		Queue<Musteri> musteriQueue = new PriorityQueue<>();
		
		musteriQueue.offer(new Musteri("mustafa", 20));
		musteriQueue.offer(new Musteri("ali", 30));
		musteriQueue.offer(new Musteri("mehmet", 40));
		musteriQueue.offer(new Musteri("aslı", 90));
		musteriQueue.offer(new Musteri("zeynep", 25));
		musteriQueue.offer(new Musteri("bugra", 100));

		//FIFO
		
		//musteri sınıfı açalım, isim ve yaş değeri tutsun
		//main de müşteri tutatn priorityQueue oluştur
		//kuyruğa müşterileri atalım
		
		//müşteriler yaş önceliğine göre işlemlerini yapıp kuyruktan çıkacak
		//yaşı büyük olan ilk sırayı alsın
		//yaşa göre sırala
		
		
		 while (!musteriQueue.isEmpty()) {
	            Musteri musteri = musteriQueue.poll();
	            System.out.println(musteri.getIsim() + " kuyruktan çıkarıldı. Yaşı: " + musteri.getYas());
	        }
		 
		 Queue<Integer> intquee = new PriorityQueue<>();
			intquee.offer(20);
			intquee.offer(3);
			intquee.offer(5);
			intquee.offer(30);
			intquee.offer(27);
			while (!intquee.isEmpty()) {
				System.out.println("Kuruktan çıkmıştır: " + intquee.poll());
			}
			
			Queue<String> queue = new PriorityQueue<>();

			queue.offer("Ali");
			queue.offer("Hasan");
			queue.offer("Ahmet");
			queue.offer("Aslı");
			queue.offer("zeynep");
			queue.offer("Hüseyin");
			while (!queue.isEmpty()) {
				System.out.println("Kuruktan çıkmıştır: " + queue.poll());
			}

			
			// FIFO

			// Musteri sınıfı açalım isim ve yas
			// mainde bitane öncelikli queue oluşturalım
			// kuyruga müşterileri atalım

			// müsteriler yas önceliğine göre işlemlerini yapıp kuyruktan çıkıcak
			// yaşı büyük olanlar ilk sırada yer alacak
			// yaşa göre bir sıralama ayapıcaz

			// Comparable
	}
	 

}
