package chapter_10.practice;

public class PoisonMatango extends Matango{
	
	boolean poison = true;
	int poisonCount = 5;
	
	public PoisonMatango(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	
//	ヒーローに毒状態の間継続的に５ターン２ポイントずつダメージを与える
	public void attack (SuperHero s) {
		while(this.poisonCount > 0) {
			System.out.println(this.name + "毒攻撃");
			 System.out.println(s.name + "に毒を浴びせた");
			 s.hp -=2;
			 System.out.println(s.name + "2の毒ダメージ");
			 poisonCount --;
		}
		
		
	}
	
	
	


}
