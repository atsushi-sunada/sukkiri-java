package chapter15.practice;

public class Main {
	public static void main(String[] args) {
		String s1 = "Java programming";
		String s2 = "java";
		String s3 = "JAVA";
		Player p = new Player("名前");
		
		
		if (s2.equals(s1)) {
			System.out.println("等しい");
		}
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("大文字小文字関係なく等しい");
		}
		
		System.out.println("s1の長さは" + s1.length());
				
		
		System.out.println("文字列の切り離し"+ s1.substring(3,8));
		
		//正当なプレイヤー名であるか
		
		

	}

}
