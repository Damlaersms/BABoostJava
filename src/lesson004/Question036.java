package lesson004;
import java.util.Scanner;
public class Question036 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React textini programı başlattığımızda virgülden ayırcaz
		
		//Java
		//Spring
		//Postgre
		//React
		
		String list = "Java,Spring,Postgre,React";
		String[] str = list.split(",");
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		//*******************************************************************************************
		//alternatif yol: bu çok kötü bi yol
		//substring
		
		System.out.println(list.substring(0,4));
		System.out.println(list.substring(5,11));
		System.out.println(list.substring(12,19));
		System.out.println(list.substring(20,25));
		
		//fotodan yaz.
		//fotodan yaz2.
	
	}

}
