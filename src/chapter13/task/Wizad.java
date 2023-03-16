package chapter13.task;

public class Wizad {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		//trueの場合０を代入するfalseの場合は、そのままHPを返す
		if(hp < 0) {
			this.hp = 0; 
		} else {
			
		    this.hp = hp;	
		}
	}
	
	public int getMp() {
	
		return this.mp;
	}
	
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("設定したMPが有効ではありません");
		}
		this.mp =mp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いの名前が有効ではありません");
		}
		this.name =name;
	}
	
	public Wand getWand() {
		return this.wand;
	}
	
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("杖を持たせてください");
		}
		this.wand =wand;
	}
	

}


/*
 *１３－２
 * エラーの内容：
 *
 *他クラスであるWandのprivateフィールドを直接呼べない
 *
 * 原因：
 * privateしていのアクセス修飾子をメソッド経由ではなく直接呼び出していることが要因
 */

