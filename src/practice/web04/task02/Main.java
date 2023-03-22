package practice.web04.task02;

public class Main {
	public static void main(String[] args) {
		
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println(x/y);
		} catch (ArithmeticException e) {
			System.out.println("割る数が０になっています");
		} catch (NumberFormatException e) {
			System.out.println("引数は２つの数値を測定してください");
		} finally {
			System.out.println("プログラムを終了します");
		}
		
	}

}
