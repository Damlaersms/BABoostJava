package lesson018;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek {

	public static void main(String[] args) {

		/*
		 * Bir taneString que oluşturalım
		 * Kuyruğun içine isimler atalım
		 * kuyrukta elemanları yazdıralım
		 */
		
		Queue<String> kuyruk = new LinkedList<>();
		kuyruk.offer("ali");
		kuyruk.offer("ayşe");
		kuyruk.offer("fatma");
		kuyruk.offer("ahmet");
		
		System.out.println(kuyruk);
		
		//FIFO (first in first out)
		
		/* kuyruk boşalana kadar elemanları çıkaralım
		 * çıkardığımız elemanları yazdıralım
		 */
		
		System.out.println(kuyruk.remove());
		System.out.println(kuyruk.remove());
		System.out.println(kuyruk.remove());
		
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk);
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk);
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk);
		
		
		while(!kuyruk.isEmpty()) {
			System.out.println(kuyruk.poll());
		}
		
		System.out.println(kuyruk);
	}

}
