package chapter06.calcapp.logics;

public class calckensyo {
	
	public static void knnsyo(int c, int d) {
		if(c < 20 && d > 10) {
			System.out.println("合格です");
		} else if(c > 20 || d > 5) {
			System.out.println("引き算はできています");
			
		} else if(c > 50 || d >0) {
			System.out.println("足し算はできています");
		}
			else {
			System.out.println("もう少し頑張りましょう");
		}
		
	}

}
