package chapter_8.task8_1;

//聖職者の設計書
public class Cleric {	
//	ステータス
	
		String name;
		int hp = 50;
		int mp = 10;
		final int max_hp = 50;
		final int max_mp= 10;	
		
//		聖職者のスキル
		
//		セルフエイド
//		効果：自分自身のhpを最大まで回復させる
//		詳細：mpを５消費すること
		
		public void selfAid(){ //インスタンスメゾット
			System.out.println("セルフエイドを唱えた");
			if(mp>5) {
				this.mp -= 5;
				this.hp += this.max_hp;
				System.out.println("HPが回復しました");
			} else {
				System.out.println("MPが足りません");
			}	
		}
		
//		祈る
//		効果：自分のMPを回復させる
//		詳細：祈った秒数にランダムで0~2ポイントの補正を加えた量を回復
//		最大MPを超えることはない
		
		public int pray (int p){ //戻り値ありのインスタンスメゾッド
			
			System.out.println(this.name + "は祈り始めた");
			int heel = new java.util.Random().nextInt(2) + p;
			
//			最大から消費分しているMPと回復しているMPを比べる
//			int recovery = Math.min(max_mp - this.mp, heel);
//			this.mp = recovery;
//			System.out.println(this.name + this.mp + "回復しました");
//			return recovery;
//			
			
			
//			最大mpとheelを超えないようにする
			if(max_mp - this.mp >= heel) {
				this.mp += heel;
				System.out.println(heel + "回復した");
				int recovery = heel; 
				return recovery;
			} else {
				int recovery = this.max_mp;
				System.out.println(recovery + "回復しました");
				return recovery;
			}
		}
			
			
			
			
			
}
