package lesson004;

public class Question037 {

	public static void main(String[] args) {
		// verilen kelimenin içinde kaç tane e olduğunu yazalım
		
		String kelime = "el elee el elee lale elee";
		char harf = 'e';
		int sayac = 0;
        for(int i = 0; i < kelime.length(); i++)
        {
            if(kelime.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println(sayac);
		
        String upText = kelime.toUpperCase();
        System.out.println(upText);
        
        String lowText = kelime.toLowerCase();
        System.out.println(lowText);
        
        
	}

}
