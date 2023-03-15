package chapter_10.practice;

public class Hero {
	String name ="ミナト";
	int hp = 100;
	
	//コンストラクタ
	public Hero() {
	
		System.out.println("Heroのコンストラクタの確認");
	}
	
	//戦う
	public void attack(Matango m) {
		System.out.println(m.name + "の攻撃");
		m.hp -=5;
		System.out.println("5ポイントの攻撃を与えた");
	}
	
	//逃げる
	public void run() {
	    System.out.println(this.name + "逃げ出した");
    }
	
	//finalがついているため子クラスではオーバーライド禁止
	//・オーバーライド：親クラスにで定義したメゾットを子クラスにて再定義できないこと
	//メゾットは良いがフィールドをオーバーロードさせてはいけない
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "転んだ");
		System.out.println("5ダメージ");
		
	}
	
	

}
