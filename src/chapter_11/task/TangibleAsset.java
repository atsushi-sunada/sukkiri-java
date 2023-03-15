package chapter_11.task;

public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	boolean katati;
	double weight;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color, boolean katati) {
		super(name,price);
		this.color = color;
		this.katati = katati;
	}
	//メゾット
//	メゾットを完成させなければならない
	public String getColor() { return this.color;}
	public double getWeight() { return this.weight;}
	public void setWeight(double weight) { this.weight = weight;}
	
	

}
