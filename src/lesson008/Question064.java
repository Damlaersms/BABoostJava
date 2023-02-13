package lesson008;

public class Question064 {

	public static int[] toplama(int[] dizi, int[] dizi1) {
		int[] toplamArray = new int[dizi.length];
		for (int i = 0; i < dizi.length; i++) {
			toplamArray[i] = dizi[i] + dizi1[i];
			System.out.print(toplamArray[i] + " ");
		}
		return toplamArray;

	}

	// parametre olarak iki tane array alan
	// ve aldığı arrayleri toplayıp farklı bir arrayin içinde saklayan metod

	// toplamları yazdırıcaz
	
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 78 };
		int[] array2 = { 1, 2, 3, 4, 5, 78 };

		toplama(array1, array2);

	}

}
