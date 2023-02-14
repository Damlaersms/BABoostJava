package maratonExam01;

public class AnswerToQuestion03 {
	
	public static void karakterSayici(String metin , char karakter) {
		
		int kacTane = 0;
		
		for (int i = 0; i < metin.length(); i++) {
			if(metin.charAt(i) == karakter) {
				kacTane++;
			}
			
		}System.out.println(kacTane);
		
	}
	public static void main(String[] args) {
		karakterSayici("çay içmek ister misin?", 'ç');
		karakterSayici("çay içmek ister misin?", 'ö');

	}

}
