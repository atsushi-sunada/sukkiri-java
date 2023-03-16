package chapter09.task9_2;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	
	public static void heal(Thierf thierf) {
		thierf.hp += 10;
	}
	
	public static void main(String[] args) {
		
		int baseHp = 25;
		Thierf t = new Thierf("アサカ", baseHp);
		//intとThierf型では値を入れる箱が違うため参照しなければいけない収納しているメモリーの位置も違ってくる
		heal(baseHp);
		System.out.println(baseHp + ":" + t.hp + ":" + t.mp);
		
		
		heal(t);
		System.out.println(baseHp + ":" + t.hp);
	}
}


//healメゾットを呼び出し引数にbaseHpを渡しても型が違うためメゾット内での代入は呼び出しもとに影響しないためt.hpは変わらない。
//引数がクラスのため変数ｔにしまっているメモリの場所をもとに参照渡しにより、t.hpとthierfが同じメモリの位置に値をしまっているため代入が両方に反映してしまう。