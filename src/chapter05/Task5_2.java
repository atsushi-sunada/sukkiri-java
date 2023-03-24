package chapter05;

public class Task5_2 {
	// Funatsu:字下げ文字をタブか半角スペースどちらかに揃えましょう
	public static void main(String[] args) {
		email("java", "xxxx@xxxx", "javaの勉強中です");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}
