package lesson006;

public class Question050 {

	public static void main(String[] args) {
		
		// matriste bulunan tek sayıları farklı bir arrayin içine atalım.
		
		
		
		int[][] matris = { { 56, 23, 678, 231, 5 }, 
							{ 234, 21, 78, 26, 6 }, 
							{ 654, 33, 32, 67, 2 },
							{ 189, 35, 56, 89, 8 }};
		
		int[] tekSayilar = new int[matris.length * matris[0].length];
		
		int index = 0;
		for (int i = 0; i <  matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if(matris[i][j] %2 != 0) {
				tekSayilar[index] = matris[i][j];       
				index ++;		
				}
			}
		}
		for (int j = 0; j< index; j++) {
			System.out.print(tekSayilar[j] + " ");
		}
	}

}
