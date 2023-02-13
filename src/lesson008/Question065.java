package lesson008;

public class Question065 {

	public static String harfDegistir(String kelime) {
		if (kelime.length() < 2)
			return kelime;
		if(kelime.length()>100 || kelime.length()<0)
			return kelime;
		char[] ch = kelime.toCharArray();
		char gecici = ch[0];
		ch[0] = ch[ch.length - 1];
		ch[ch.length - 1] = gecici;
		return String.valueOf(ch);
		}
//*******************************************************************************************************
	public static String harfDegistir2(String kelime) {
		if (kelime.length() < 2)
			return kelime;
		if(kelime.length()>100 || kelime.length()<0)
			return kelime;
		StringBuilder stringBuilder = new StringBuilder(kelime);
		char first = kelime.charAt(0);
		char last = kelime.charAt(kelime.length()-1);
		
		stringBuilder.setCharAt(0, last);
		stringBuilder.setCharAt(kelime.length()-1, first);
		
		return stringBuilder.toString();
		
	}
//*******************************************************************************************************
	public static boolean isPalindrome(String kelime) {
		String tersi = new StringBuilder(kelime).reverse().toString();
		boolean kontrol = kelime.equals(tersi);
		return kontrol;
	}
	public static void main(String[] args) {
		// cosenio üzerinden task... 5 dk
		// girilen kelimenin ilk ve son harfini birbiriyle değiştirelim
		// girilen kelime 0 ile 100 arasında olması lazım
		// eğer tek harfli girildiyse girilen harfi return etsin
	
		
		
		System.out.println(harfDegistir2("consio"));
		System.out.println(isPalindrome("skayaks"));
	}

}
