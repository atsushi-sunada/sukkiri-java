package chapter_9.practice;

public class Hero {
	
	
	
	
	String name;
	int hp;
	Sword sword;  //勇者が持つ剣の情報 has-aの関係
	
	
	//コンストラクターの場合、ここでString name = 100;のように初期値を設定してあげるとインスタンス生成時に値が渡せる
//	
//	public Hero(String name) {
//		this.name = name;
//		int hp = 100;
//		
//	}
	
	
	public void attck () {
		System.out.println(this.name + "は攻撃した");
		System.out.println("敵は５ポイントのダメージを与えた！");
	}

}
