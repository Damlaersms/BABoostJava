package lesson018;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	public static void main(String[] args) {

		// 2 tane set oluşturalım
		// tekrar edenler , tekrar etmeyenler
		// kullanıcıdan metin alcaz
		// eğer tekrar harf varsa tekrarEdene
		// tekrar etmeyen varsa etmeynleri yaz

		// java
		// tekrarEdenler --> a
		// tekrarEtmeyenler -->j,v
		
		Set<Character> tekrarEdenler = new HashSet<Character>();
		Set<Character> tekrarEtmeyenler = new HashSet<Character>();

		Scanner scanner = new Scanner(System.in);
		System.out.println(" metin giriniz: ");
		String metin = scanner.nextLine();

		
		
		for (int i = 0; i < metin.length(); i++) {
            for (int j = i+1; j < metin.length(); j++) {
                if(metin.charAt(i)== metin.charAt(j)) {
                    tekrarEdenler.add(metin.charAt(i));
                }
            }
            if(!tekrarEdenler.contains(metin.charAt(i))) {
                tekrarEtmeyenler.add(metin.charAt(i));
            }
        }
        System.out.println(" tekrar edenler: "+ tekrarEdenler);
        System.out.println("\n tekrar etmeyenler: " + tekrarEtmeyenler);
        
        
        
        //hocanın çözümü:
//        for (int i = 0; i < metin.length() ; i++) {
//			if(!tekrarEdenler.contains(metin.charAt(i)) && !tekrarEtmeyenler.add(metin.charAt(i))) {
//				tekrarEdenler.add(metin.charAt(i));
//				tekrarEtmeyenler.remove(metin.charAt(i));
//			}
//		}
//		System.out.println("tekrarEdenler");
//		for (Character character : tekrarEdenler) {
//			System.out.print(character +" ,");
//		}
//		System.out.println();
//		System.out.println("Tekrar etmeyenler");
//		for (Character character : tekrarEtmeyenler) {
//			System.out.print(character +" ,");
//		}
	}

}
