package chapter11.practice;
//将来の開発に備える
//そこで発生する不都合
//・メゾットの詳細が未定

public abstract class Character {
	String name;
	int hp;
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m); //{ //メゾットにabstroctの場合本文の中身は書かず、;で終了
//	System.out.println(this.name + "の攻撃");
//		m.hp -= 10; //←ここがどういう数値にしてよいのかきまっていないためわからない
//		A、各クラスでオーバーライドを行う
//		
//		
//		System.out.println("敵に？？ポイントのダメージを与えた");
//	}

}
