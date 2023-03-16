package chapter10.task10_3;


//毒に特化したお化けキノコ
public class PoisonMatango extends Matango {
	
	//	毒を用いた可能な限りの回数を行うことができ、初期値５回の攻撃ができる
	int poisonCount = 5;
	
//親のコンストラクターを呼び出す必要があるため
//また、指定のインスタンスの生成があるため、それに沿って引数を受け取る
	public PoisonMatango(char suffix) {
	
		super(suffix);
	}
	
	public PoisonMatango(char suffix, int hp) {
		super(suffix,hp);
	}
	
	
//キノコお化けと同様の攻撃をする
	public void attack(Hero h) {
		super.attack(h);
		
		
//	もし攻撃回数が0でなければ以下のことを行う
		if(this.poisonCount > 0) {
			//	・「さらに毒の胞子をばらまいた！」と表示
			System.out.println("さらに毒の胞子をばらまいた！");
			
			//	・勇者のHPの５分の１に相当するダメージポイントを勇者のHPから引く
			int dmg = h.hp / 5;
			
			int d = h.hp - dmg;
			
			//	・減った結果を「～ポイントのダメージ！」と表示する
			System.out.println(d + "ポイントのダメージ！");
			
			//	毒攻撃の回数を１減らす
			poisonCount --;
			
		}
	
		
				
		
		
		
	}

	
	
	

}
