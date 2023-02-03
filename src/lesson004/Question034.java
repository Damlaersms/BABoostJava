package lesson004;
import java.util.Scanner;
public class Question034 {

	public static void main(String[] args) {
		// klavyeden girilen sıfır ile 100 arasında 100 dahil
		// 5 adet sayıdan en büyük ve en küçük olanı bulan program
		
		Scanner scanner = new Scanner(System.in);
        int eb=0;
        int ek=0;
        for (int i=1; i<=5; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = scanner.nextInt();
            if(sayi<0 || sayi>100) { 
            	System.out.println("lütfen geçerli bir sayı giriniz.");
            	
            }else {
            	  if (i==1)
                  {
                      eb=sayi;
                      ek=sayi;
                  }
                  
                  if (sayi>eb)
                      eb=sayi;
                  
                  if (sayi<ek)
                      ek=sayi;
            }
          
        }
        System.out.println("en buyuk" + eb);
        System.out.println("en kucuk" + ek);
	}

}
