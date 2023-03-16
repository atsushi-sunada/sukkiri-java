package chapter11.task;

public abstract class Asset {
	String name;
	int price;
	public Asset (String name, int price) {
		this.name = name;
		this.price = price;
	}

	//メゾット
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	
	
}
