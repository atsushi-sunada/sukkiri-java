package chapter_9.practice;

public class Main {
	public static void main(String[] args) {
		
		Sword s = new Sword();
		s.name = "火の剣";
		s.damage = 10;
		
		Sword i = new Sword();
		i.name = "氷の剣";
		
		//インスタンスを生成
//		Practice h1; 
//		h1 = new Practice();
		
		//インスタンスを生成
//		Hero h1 = new Hero("ミナト"); コンストラクターを設定していると引数としてミナトが渡される
		//引数がない場合エラーとなるため、オーバーロードの概念を利用する
		
		Hero h1  = new Hero(); //代入文なので右が先に評価される
		//右辺の実行が終了時点で、左辺のｈにはインスタンスが入っているメモリの番地（数値）が代入される
		//値に関しては別のところにある
		h1.hp = 100;
		h1.name = "ミナト";
		h1.sword = s;
		
		Hero h2; //クラス型を宣言
		
		//以下参照しているメモリーの”番地ではなく値”が変わったのでh1とh２の値は同じになる
		h2 = h1;
		
		h2.hp = 200;
		h2.sword = i;
		System.out.println(h1.hp);
		
		//heroインスタンスがh１もh２も同一人物なので参照型の用途が使われる
		//剣インスタンスは２つのインスタンスが生成しているのでインスタンスの独立性が発生している
		
		System.out.println("現在の剣は" + h1.sword.name); 
		
	}

}
