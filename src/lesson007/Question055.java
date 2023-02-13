package lesson007;

public class Question055 {

	public static void main(String[] args) {

		// Verilen dizide rakamların farkının en az oldugu sayıların farkını bulalım

				int[] array2 = { 1, -10, -4, -1};
				// mutlak değer alabiliriz
				// int mutlakDeger = Math.abs(-4);
				
				int mins = Integer.MAX_VALUE;

				for (int i = 0; i < array2.length; i++) {

					for (int j = i + 1; j < array2.length; j++) {

						int fark = Math.abs(array2[i] - array2[j]);
						if (fark < mins) {
							mins = fark;
						}
					}
				}
				System.out.println(mins);
				//14:47
			
				
				System.out.println("*************");
				
				int[] fark = new int[array2.length];

				boolean kosul = true;

				while (kosul) {
					for (int i = 0; i < array2.length; i++) {
						if (i != array2.length - 1) {
							fark[i] = Math.abs(array2[i] - array2[i + 1]);
						} else if (i == array2.length - 1) {
							kosul = false;
						}
					}
				}
				int max = fark[0];
				
				for (int i = 0; i < fark.length; i++) {
					if(fark[i] > max) {
						max = fark[i];
					}
				}
				System.out.println(max);
		
	}

}
