package practice.web05;

public class Buki extends Item {

	public Buki(String name, int value) {
		super(name, value);
	}
	
	public void use() {
		System.out.println(this.name + "で攻撃");
		System.out.println("敵に" + this.value + "のダメージ");
	}
	

}
