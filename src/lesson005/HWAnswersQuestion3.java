package lesson005;

public class HWAnswersQuestion3 {

	public static void main(String[] args) {

		// bir dizide 13 var ise hem 13ü
		// hem de bir sonraki indeksi toplama işlemine almıycak şekilde
		// dizideki elemanların toplamını bulalım
		int nums2[] = { 1, 13, 5, 13,13,13, 2, 5, 7, 1};
		int toplam = 0;
		for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == 13) {
                if (i < nums2.length-1) { 
                    i++;	
                    if(nums2[i]==nums2[i-1]) 
                        i--;			
                }
			} else {
				toplam += nums2[i];
			}
		}
		System.out.println("Toplam = " + toplam);
		
		
		
		/* ayşe'nin çözümü:
		 * 
		 *int nums2[] = { 1, 13, 5, 13, 13, 2, 5, 7, 1, }; 
		 *int toplam=0;
		 *boolean birOncekiSayiOnUcMu = false;
		 *for(int i =0; i<nums2.length;i++) {
		 *	if(nums2[i]==13) {birOncekiSayiOnUcMu = true;}
		 *		else if(birOncekiSayiOnUcMu == true) {birOncekiSayiOnUcMu = false;}
		 *	else {toplam=toplam+nums2[i];}}System.out.println(toplam);
		 * */
		 

	}

}
