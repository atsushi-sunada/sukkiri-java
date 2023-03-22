package practice.web04.task01;

public class Main {
	public static void main(String[] args) {
		
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println(x+y);	
				
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("引数が足りません");
		} catch (NumberFormatException ex){
			System.out.println("引数はそれぞれ数値でなければいけません");
			
		}
		
	}

}
