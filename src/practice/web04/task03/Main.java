package practice.web04.task03;

public class Main {
	public static void main(String[] args) {
		
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			Warizan(x,y);
		} catch (ArithmeticException e) {
			System.out.println("割る数が０になっています");
		} catch(NumberFormatException e) {
			System.out.println("引数は２つの数値を指定してください");

		}
		
	}

	private static void Warizan(int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	

}
