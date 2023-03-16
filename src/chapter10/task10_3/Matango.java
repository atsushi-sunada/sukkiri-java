package chapter10.task10_3;

public class Matango {
	int hp;
	char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public Matango(char suffix, int hp){
		this.suffix = suffix;
		this.hp = hp;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println("10のダメージ");
		h.hp -= 10;
		
	}
	

}
