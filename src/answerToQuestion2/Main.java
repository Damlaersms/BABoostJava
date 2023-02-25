package answerToQuestion2;

import java.util.Random;

public class Main {
	
	/*
	 * takım diye bir sınıf oluşturalım name ve puan, kasa fieldları olsun. Takımlar aralarında
	 * maç yapacak şekilde bir method yazalım. Methodda random 1,2,3 sayıları arasından seçilecek;
	 * 1 gelirse ilk takım maçı kazanacak ve 3 puan alacak, takım kasasına 10000TL eklenecek
	 * 2 gelirse ikinci takım maçı kazanacak ve 3 puan alacak, takım kasasına 10000TL eklenecek
	 * 1 veya 2 gelmezse maç berabere biter, iki takım da 1er puan alır ve kasalarına 5000 TL eklenir
	 */
	// takimManager.macYap(takim1, takim2);
	
	//kasa göster metodu:
	//çıktı : takım ismi ... + takım kasası ...
	
	//puan durumu gösteren metod için parametre olarak takımlar arrayini göndercez.
	//çıktı : takım + puanı bize yazdırsın
	
	//iflasetmedurumu() olan takımları göstersin
	//takımın kasası 5000 TL den az ise bu takımları listele
	
	//şampiyonu göster metodu
	//parametre olarak takımlar array
	// !!!! şampiyon
	
	
	public static void main(String[] args) {

		Takim[] takimlar = new Takim[4];
		TakimManager takimManager = new TakimManager();
		
	    takimlar[0] = new Takim("Barcelona");
	    takimlar[1] = new Takim("RealMadrid");
	    takimlar[2] = new Takim("Sevilla");
	    takimlar[3] = new Takim("Atlatico Madrid");

	    // her takım birbiriyle 1'er kez maç yapsın:
	    
	    Takim takim1, takim2;
	    for (int i = 0; i < takimlar.length - 1; i++) {
	        takim1 = takimlar[i];
	        for (int j = i + 1; j < takimlar.length; j++) {
	            takim2 = takimlar[j];
	            takimManager.macYap(takim1, takim2);
	        }
	    }

	    takimManager.kasaGoster(takimlar[0]);
	    takimManager.kasaGoster(takimlar[1]);
	    takimManager.kasaGoster(takimlar[2]);
	    takimManager.kasaGoster(takimlar[3]);
	    takimManager.puanGoster(takimlar);
	    takimManager.sampiyonGoster(takimlar);
	    takimManager.iflasDurumuGoster(takimlar);
	}

}
