package chapter11.practice2;

public class Goblin extends WalkingMonster {
	
	public Goblin(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
//	ナイフを持つ
//	Sword s = s;
	@Override
	public void attack(Hero h) {
		System.out.println("ナイフで切り付けた");
		int at = 10;
		int dmg = h.hp - at;
		System.out.println(h.name + "10ポイントのダメージを与えた");
		System.out.println(h.name + "の体力は残り" + h.hp);
		
	
    }

//	@Override
//	public void attack() {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
	


}
