package answerToQuestion2;

import java.util.ArrayList;
import java.util.Random;

public class TakimManager {

	public void macYap(Takim takim1, Takim takim2) {
		Random random = new Random();
		int rnd = random.nextInt(1, 4);
		if (rnd == 1) {
			takim1.setPuan(takim1.getPuan() + 3);
			takim1.setKasa(takim1.getKasa() + 10000);
			System.out.println(takim1.getName() + " " + takim2.getName() + " 'e karşı maçı kazanmıştır!");
		} else if (rnd == 2) {
			takim2.setPuan(takim2.getPuan() + 3);
			takim2.setKasa(takim2.getKasa() + 10000);
			System.out.println(takim2.getName() + " " + takim1.getName() + " 'e karşı maçı kazanmıştır!");
		} else {
			takim1.setPuan(takim1.getPuan() + 1);
			takim2.setPuan(takim2.getPuan() + 1);
			takim1.setKasa(takim1.getKasa() + 5000);
			takim2.setKasa(takim2.getKasa() + 5000);
			System.out.println(takim1.getName() + " ve " + takim2.getName() + " berabere kalmıştır!");
		}
	}

	public void puanGoster(Takim[] takimlar) {
		System.out.println("**Puan durumu** ");
		for (Takim takim : takimlar) {
			System.out.println(takim.getName() + " Puan: " + takim.getPuan());
		}
	}

	public void kasaGoster(Takim takim) {
		System.out.println(takim.getName() + " Kasasındaki tutar: " + takim.getKasa() + " TL vardır.");
	}

	public void iflasDurumuGoster(Takim[] takimlar) {
		System.out.println("**İflas Durumu** ");
		for (Takim takim : takimlar) {
			if (takim.getKasa() < 5000) {
				System.out.println(takim.getName() + " iflas etmek üzere" + " -- Kasadaki tutar: " + takim.getKasa()+ " TL'dir.");
			}
		}
	}
	
	// 2 takımın puanları en yüksekse (eşitse) iki şampiyon belirleyip yeniden maç yaptırıp kıyasladık:
	
	public void sampiyonGoster(Takim[] takimlar) {
	    Takim sampiyon = takimlar[0];
	    Takim sampiyon2 = null;

	    for (int i = 1; i < takimlar.length; i++) {
	        if (takimlar[i].getPuan() > sampiyon.getPuan()) {
	            sampiyon2 = sampiyon;
	            sampiyon = takimlar[i];
	        } else if (sampiyon2 == null || takimlar[i].getPuan() > sampiyon2.getPuan()) {
	            sampiyon2 = takimlar[i];
	        }
	    }

	    if (sampiyon2 != null && sampiyon.getPuan() == sampiyon2.getPuan()) {
	        System.out.println(sampiyon.getName() + " ve " + sampiyon2.getName() + " takımları arasında maç tekrarı yapılacak!");
	        macYap(sampiyon, sampiyon2);
	        sampiyonGoster(takimlar); // biri şampiyon olana kadar maç devam edecek
	    } else {
	        System.err.println("!!! ŞAMPİYON !!! " + sampiyon.getName());
	    }
	}
	
	
		// Ama 3 veya 4 takımın puanı eşit ve en yüksek olursa??!! 
		// Bu durum için en yüksek puanlı takımları belirleyip yeni bir diziye atıp, 
		// o dizi için başka bir metodla yeniden maç yaptırmaya çalıştım,
		// ama sampiyonGoster metoduyla birlikte kullanamadım.
	
//	public void tekrarMacYap(Takim[] takimlar) {
//	    Takim[] kazananlar = new Takim[takimlar.length];
//	    
//	    int enYuksekPuan = 0;
//	    int sayac = 0;
//
//	    // En yüksek puanı ve bu puana sahip takımları belirledik:
//	    for (int i = 0; i < takimlar.length; i++) {
//	        if (takimlar[i].getPuan() > enYuksekPuan) {
//	            enYuksekPuan = takimlar[i].getPuan();
//	        }
//	    }
//	    
//
//	    // En yüksek puana sahip takımları kazananlar dizisine ekledik:
//	    for (int i = 0; i < takimlar.length; i++) {
//	        if (takimlar[i].getPuan() == enYuksekPuan) {
//	            kazananlar[sayac] = takimlar[i];
//	            sayac++;
//	        }
//	    }
//
//	    // Kazananlar arasında maçlarını oynattık:
//	    if (kazananlar.length == 2) {
//	        macYap(kazananlar[0], kazananlar[1]);
//	    } else if (kazananlar.length > 2) {
//	        for (int i = 0; i < kazananlar.length - 1; i++) {
//	            for (int j = i + 1; j < kazananlar.length; j++) {
//	                macYap(kazananlar[i], kazananlar[j]);
//	            }
//	        }
//	    }
//	}


}
