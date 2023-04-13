package chapter15.task15_1;

public class Main {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<100; i++) {    // Funatsu: =と<の両脇は半角空白を入れましょう
			sb.append(i+1).append(",");
			
		}
		
		String s = sb.toString();
		String[]a = s.split(",");    // Funatsu: String[]と変数の間には半角空白を入れましょう。データ型と変数の境目として空白がないと、コードがわかりにくくなる恐れがあります。
	}

}
