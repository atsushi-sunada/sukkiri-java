package chapter14.task14_2;

public class Cleric {
	String name;
	int hp;
	int mp;
	final int Max_Hp = 50;
	final int Max_Mp = 10;

	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;

	}

	public void selfAid() { //インスタンスメゾット
		System.out.println("セルフエイドを唱えた");
		if (mp > 5) {
			this.mp -= 5;
			this.hp += this.Max_Hp;
		} else {
			System.out.println("MPが足りません");
		}
	}

	//		祈る
	//		効果：自分のMPを回復させる
	//		詳細：祈った秒数にランダムで0~2ポイントの補正を加えた量を回復
	//		最大MPを超えることはない

	public int pray(int p) { //戻り値ありのインスタンスメゾッド

		System.out.println(this.name + "は祈り始めた");
		int heel = new java.util.Random().nextInt(3) + p;

		if (this.mp + heel < this.Max_Mp) {
			this.mp += heel;
			System.out.println(heel + "回復しました");

		} else {
			this.mp = this.Max_Mp - this.mp; // 
			System.out.println(this.mp + "回復しました");
		}
		int recovery = this.mp;
		return recovery;
	}

}
