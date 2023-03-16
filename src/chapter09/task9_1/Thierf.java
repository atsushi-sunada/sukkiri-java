package chapter09.task9_1;

public class Thierf {
	
	String name;
	int hp;
	int mp;
	
	//コンストラクタを使う
	public Thierf(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	//別のコントラクタを持ってくる
	public Thierf(String name, int hp) {
		this(name, hp ,5);
	}
	
//	別にコンストラクター
	public Thierf (String name) {
		this(name,40,5);
		
	}

}
