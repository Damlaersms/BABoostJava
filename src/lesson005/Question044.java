package lesson005;

public class Question044 {

	public static void main(String[] args) {
		// 2 ve 4 ün kaç kere geçtiğini
		//hangisinin daha fazla olduğunu
		//ÖDEV!!!!!!!!!!!!!!!!
		
		
		int[] sayilar = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		int sayac2 =0;
		int sayac4 =0;
		for (int i=0; i<sayilar.length; i++) {
			if (sayilar[i]==2) {
				sayac2++;
			}else if(sayilar[i]==4){
				sayac4++;
			}	
		}
		System.out.println(sayac2 + " tane 2 vardır ve " + sayac4 +" tane 4 vardır.");
		if(sayac4>sayac2) {
			System.out.println("4, 2den daha fazladır");
		}else if (sayac4 < sayac2){
			System.out.println("2, 4ten daha fazla");
		}else {
			System.out.println("eşit");
		}
			
	}

}
