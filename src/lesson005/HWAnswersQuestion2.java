package lesson005;

public class HWAnswersQuestion2 {

	public static void main(String[] args) {
		//bir dizide en büyük ikinci sayıyı bulan program
		
		int nums[] = { 1, 13, 13, 1, 2, 5, 13, 1 };
		int eb = nums[0];
        int eb2 = nums[1];
        
        for (int i = 1; i < nums.length; i++) {
           if (nums[i] > eb) {
                eb2 = eb;
                eb = nums[i];
                
           } else if (nums[i] > eb2 && nums[i] != eb) {
                eb2 = nums[i];
                
            }
        }
        System.out.println("En büyük ikinci sayı " + eb2);
        System.out.println("En büyük sayı: " + eb);
				
	}

}
