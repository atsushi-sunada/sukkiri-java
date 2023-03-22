package chapter14.practice1;

public class Main {
	public static void main(String[] args) {
		Object o1 = new Printer();
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		Hero h2 = new Hero();
		h2.hp= 200;
		h2.name = "なると";
		if(h.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		
		
		System.out.println(h.toString());
		//→HP～と表示させたいときはtoString()をオーバーライドする必要がある
		//何をもって意味的に同じかとみなすかをオーバーライドによって指定しなければならない
	}

}

//等値　＝＝　アドレス値の比較
//等価　equals 同じ内容のものかを判定する（アドレス値じゃなくても良い）
