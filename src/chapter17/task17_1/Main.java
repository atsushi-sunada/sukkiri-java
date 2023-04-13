package chapter17.task17_1;

// 17章の演習1．2.3

public class Main {
	public static void main(String[] args) {
		try {
			String s = null;    // Funatsu: ←字下げがズレています
		    System.out.println(s.length());
		    int i = Integer.parseInt("三");
		    
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました。");
			System.out.println("--ステックトレース（ここから）--");    // Funatsu: 細かいですが、「スタックトレース」が正しいです
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		} catch(NumberFormatException n) {
			System.out.println("NumberFormatException例外をcatchしました");
			
		}
		
		
	}

}
