package chapter04;

public class Task4_2 {
	public static void main(String[] args) {
		int[] moneyList = new int[] { 121902, 8302, 55100 };
		// Funatsu:↓ここも細かいですが、半角1文字分字下げがずれて居ますので、上の行と揃えましょう
		for (int i = 0; i < moneyList.length; i++) { // Funatsu:不等号の両端に半角スペースを入れましょう
			System.out.println(moneyList[i]);
		}
		for (int m : moneyList) {
			System.out.println(m);
		}
	}

}
