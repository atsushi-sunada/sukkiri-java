package chapter11.practice;


public class Hero extends Character {
	public void daince() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	
//	親クラスをabstractを使用して継承をしているため、親クラスで定義しているメゾットをオーバーライドしなければならない
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に１０ポイントのダメージを与えた！");
		m.hp -= 10;
	}
	

}
