package chapter_11.practice2;
//newさせない

public abstract class Monster {
//	モンスターの設計書
	//ステータス
	int hp;
	int mp;
	String name;

	
	//基本コマンド
	public abstract void attack(); //戦うメゾットの中身が詳細未定
	public abstract void run(); //逃げるメゾットtの中身が詳細未定
}
