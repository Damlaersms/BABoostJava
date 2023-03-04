package lesson017;

import java.util.Stack;

public class StackOrnek {
	
	public static void main(String[] args) {

		// ekleme işlemi

		// Stack --> (LIFO) last in first out
		// bitane stack oluşturalım
		// bi kça tane int değer atalım
		// bu stacik yazdırlarım

		// stack boşalana kadar bütün elemanları çıkartalım
		// çıkarılan her elemanı yazdıralım

		Stack<Integer> stack = new Stack<>();
		Stack<Integer> yeniStack = new Stack<>();
		stack.push(50);
		stack.push(10);
		stack.push(110);
		stack.push(150);
		stack.push(70);
		stack.add(95);

//		int sayi = stack.push(70);
//		System.out.println(sayi +"***");
//		boolean sayi2 = stack.add(95);
//		
//		for (Integer integer : stack) {
//			System.out.println(integer);
//		}
//		
//		while(!stack.isEmpty()) {
//			System.err.println(stack.pop());
//		}

		// 100 den küçük değerleri toplayıp stackten cıkaralım
		// 100 den büyükleride farklı bi stackin içine atalaım
		// hem toplamı, hemde yeni stacki yazdıralım

		System.out.println("**************");
		int toplam = 0;
		while (!stack.isEmpty()) {
			if (stack.peek() < 100) {
				toplam += stack.pop();
			} else {
				yeniStack.push(stack.pop());
			}
		}

		System.out.println(toplam);
		for (Integer integer : yeniStack) {
			System.out.println(integer);
		}
		
		int size = stack.size();
		
		for (int i = size-1; i <=0; i--) {
			
			toplam += stack.remove(i);
		}
	}

}
