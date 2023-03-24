package chapter08.task8_1;

//聖職者の設計書
public class Cleric {
	//	ステータス
	// Funatsu: 下記、字下げし過ぎです。
	String name;
	int hp = 50;
	int mp = 10;
	final int max_hp = 50; // Funatsu: 定数は大文字で書きましょう→入門p55を参照
	final int max_mp = 10; // Funatsu: 定数は大文字で書きましょう→入門p55を参照、あと=の左に半角スペースを入れましょう

	//		聖職者のスキル

	//		セルフエイド
	//		効果：自分自身のhpを最大まで回復させる
	//		詳細：mpを５消費すること

	public void selfAid() { //インスタンスメゾット
		System.out.println("セルフエイドを唱えた");
		if (mp > 5) { // Funatsu: 不等号の両端に半角スペースを入れましょう
			this.mp -= 5;
			this.hp += this.max_hp; // Funatsu: この場合、HPが1以上の場合は最大HPを超えて回復してしまいますので、直してみましょう
			System.out.println("HPが回復しました");
		} else {
			System.out.println("MPが足りません"); // Funatsu:　残りMPのチェックを入れたのは素晴らしいですね！
		}
	}

	//		祈る
	//		効果：自分のMPを回復させる
	//		詳細：祈った秒数にランダムで0~2ポイントの補正を加えた量を回復
	//		最大MPを超えることはない

	public int pray(int p) { //戻り値ありのインスタンスメゾッド

		System.out.println(this.name + "は祈り始めた");
		int heel = new java.util.Random().nextInt(3) + p; // Funatsu:2だと0〜2の乱数にならないので、見直しましょう

		//			最大から消費分しているMPと回復しているMPを比べる
		//			int recovery = Math.min(max_mp - this.mp, heel);
		//			this.mp = recovery;
		//			System.out.println(this.name + this.mp + "回復しました");
		//			return recovery;
		//			

		//			最大mpとheelを超えないようにする
		//			最大mpとheel+this.hpを比べる

		//			this.mpの方が小さいときはthis.mpに回復した量を足す
		//			max_mpの方が小さいときはmpを
		//			５<１０がfalseの時
		if (this.mp + heel < this.max_mp) { //  Funatsu:例えば、 「最大MP-今のMPが1、回復量が2」の場合、これで良いでしょうか？
			this.mp += heel;
			System.out.println(heel + "回復しました");

		} else {
			this.mp = this.max_mp - this.mp;
			System.out.println(this.mp + "回復しました");
		}
		int recovery = this.mp;
		return recovery;// Funatsu:実際に回復したMPの量(recovery)のreturnを、ここに書きましょう
	}

}
