package chapter_10.practice;

//継承：Heroクラスと重複したコードをスーパーヒーロークラスでも使用可能にし、差分だけを記述しする。

public class SuperHero extends Hero {
	String name = "ミナト";
	int hp = 100;
	boolean flying;
	
	
	//コンストラクタの確認
	//すべてのコンストラクタを先頭で親のコンストラクタを呼ばなければなれない。
	//下記は暗黙のコンストラクター状態になっている
	//引数を渡したいときにsuperの記述を行う
	//コンストラクタは内側（親インスタンス）から呼び出されることになる
	public SuperHero () {
	
	    System.out.println("superheroのコンストラクタの確認");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "攻撃");
		
		//superを使うことで親クラスを利用しメゾットやフィールドを呼び出せる
		//下の記述はHeroクラスでオーバーライドしている部分
		super.attack(m);
//		m.hp -= 5;
//		System.out.println("5ポイントのダメージを与えた");
		
		if(this.flying) {
//			System.out.println(this.name + "攻撃");
//			m.hp -= 5;
			super.attack(m);
		}
	}
//	
//	public void run() {
//		System.out.println(this.name + "逃げ出した");
//	}
	
	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	
	
	
}
