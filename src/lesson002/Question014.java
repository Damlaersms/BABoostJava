package lesson002;
import java.util.Scanner;
public class Question014 {

	public static void main(String[] args) {
		
		
		//girilen 3 sayıyı büyükten küçüğe sıralayan program.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz: ");
		double x = scanner.nextDouble();
		System.out.println("İkinci sayiyi giriniz: ");
		double y = scanner.nextDouble();
		System.out.println("Üçüncü sayiyi giriniz: ");
		double z = scanner.nextDouble();
		
		 if (x <= y){ 
	            if (y <= z)
	                System.out.print(z + " "+ y + " " + x);
 
	            else if  (z <= x)
	                System.out.print(y + " "+ x + " " + z);
 
	            else if (x < z)
	                System.out.print(y + " " + z + " " + x);
	    }
 
	    if (y < x){
	        if (z <= y)
	            System.out.print(x + " " + y + " "+ z);
	        else if (z <= x)
	            System.out.print(x + " " + z + " " + y);
	        else if (x < z)
	            System.out.print(z + " " + x + " " + y);   
	    }
		
		
	}

}
