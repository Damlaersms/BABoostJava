package lesson004;

import java.util.Scanner;

public class Question035 {

	public static void main(String[] args) {
		
		// verilen kelimenin harflerini alt alta yazdıralım
		// java
		
		String kelime = "java";
        
        char[] charArray = kelime.toCharArray();
        
        for (int i = 0 ; i < charArray.length; i++)
        {
            String bosluk = "";
            
            for (int j = 0 ; j < i ; j++)
            bosluk += " ";
            
            System.out.println(bosluk+charArray[i]);
            
        }
        
        //***********************************************************************************
        String text ="java";
        System.out.println(text.length());
        for (int i=0; i<text.length();i++) {
        	System.out.println(text.charAt(i));
        }
        //***********************************************************************************
        
        //kullanıcıdan bi string değer alalım
        //aldığımız değeri
        //java
        //0. index j
        //1. index a ...
        
        Scanner scanner =new Scanner(System.in);
        String text2 = scanner.nextLine();
        for(int i=0;i<text2.length();i++) {
        	System.out.println(i + "." + " indexi: " + text2.charAt(i));
        }
        //***********************************************************************************
        
	
	
	}

}
