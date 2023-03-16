package chapter04;

public class Task4_4 {
	public static void main(String[] args) {
		int [] numbers = {3, 4, 9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
//		for(int i = 0; i<numbers.length; i++) {
		for(int n : numbers) {
//			if(input == numbers[i]) {
			if(n == input) {
				System.out.println("当たり");
			}
		}
	}

}
