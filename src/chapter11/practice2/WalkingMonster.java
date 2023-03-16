package chapter11.practice2;
//newさせない

public abstract class WalkingMonster extends Monster {
//	モンスタークラスの基本ステータスを継承
	
	
//	このクラスを元に実体化するモンスターを作成するためのメゾットを作成
//	今回はattackメゾットは親クラスと同じため抽象化する
//	逃げるメゾットは陸で走るためメゾットを完成させる
	
	public abstract void attack(Hero h);
	public void run() {
		System.out.println(this.name + "走って逃げた！");
	}
	

}
