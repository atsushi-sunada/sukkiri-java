package practice.web05;

public  abstract class Item {
	String name;
	int value;
	
	//コンストラクタ
	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public abstract void use();

}
