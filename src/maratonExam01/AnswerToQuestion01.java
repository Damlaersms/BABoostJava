package maratonExam01;

public class AnswerToQuestion01 {

	public static void starShape() {
	     int satir = 1, sutun = 0;
	        
	        while (satir <= 6) {
	            while (sutun <= satir - 1) {
	               
	                System.out.print("* ");
	                sutun++;
	            }
	            satir++;
	            sutun = 0;
	            
	            System.out.println();
	        }
	        if (true) {
	        	for (int satir2 = 0; satir2 < 4; satir2++) {
	    			for (int sutun1 = 7; sutun1 >0; sutun1--) { 
	    				System.out.print("* ");
	    				
	    			}
	    			System.out.println();
	    		}
	        }
}
	
	public static void main(String[] args) {
		starShape();
	}

}
