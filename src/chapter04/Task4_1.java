package chapter04;

public class Task4_1 {
	public static void main(String[] args) {
		int [] points = new int[4];
		double [] weghts = new double[5];
		boolean [] answers = new boolean[3];
		String [] names = new String[3];
		
		// 下記のような処理を追加されたのは良いですね！それぞれの値が何の変数か？がわかる表示にしてみましょう
		System.out.println("ポイントは" + points.length); 
		System.out.println("重さは" + weghts.length);
		System.out.println("答えの数は" + answers.length);
		System.out.println("名簿の数は" + names.length);
	}

}
