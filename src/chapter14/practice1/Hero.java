package chapter14.practice1;

public class Hero {
	String name;
	int hp;
	
	
	public String toString() {
		return "名前" + this.name+ "hp:"+ this.hp;
	}
	
	
	//Heroクラスは名前が同じであれば同じインスタンスとみなすと定義
	public boolean equals(Object o) {
		if (this == o) {
			return true; //等値なら間違いなく等価
		}
		if (o instanceof Hero) { //オーバーライド、＠oをHero型にキャストできるかを判定する
			Hero h = (Hero)o; //object型oをダウンキャストして、Hero型にしてｈに代入する
			if(this.name.equals(h.name)) { // 名前が等しければ等価
				return true;
			}
		}
		return false;
	}
}

//キャスト＝型変換
// ダウンキャスト＝サブクラスのオブジェクトにスーパークラスのオブジェクトを格納することをダウンキャストという

