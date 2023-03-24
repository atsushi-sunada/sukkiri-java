package chapter03;

public class Task3_6 {
	// Funatsu:字下げ文字をタブか半角スペースどちらかに揃えましょう
	public static void main(String[] args) {
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10); // Funatsu: ここ、0〜9にならないはずです。数値を見直してみましょう。入門p91〜p92を参照
		for (int i = 0; i < 5; i++) { // Funatsu:ここも細かいのですが、「i < 5」のようにオペランド間に半角スペースを入れましょう
			System.out.println("0~9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}

}
