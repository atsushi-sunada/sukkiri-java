package chapter15.task15_3;

public class Main {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "JaVa";
		
		
		if(s1.matches(".*")) {
			System.out.println("等しい");
		} else {
			System.out.println("間違っている");
		}
		
		if(s1.matches("A\\d{1,2}")) {
			System.out.println("等しい");
		} else {
			System.out.println("間違っている");
		}
		
		if(s1.matches("U[A-Z]{3}")) {
			System.out.println("等しい");
		} else {
			System.out.println("間違っている");
		}
			
		
		
	
	}

}
