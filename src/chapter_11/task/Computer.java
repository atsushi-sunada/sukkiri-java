package chapter_11.task;

public class Computer extends TangibleAsset {
	String makerName;
	
	//コンストラクタ
	public Computer(String name, int price, String color,boolean katati,  String makerName) {
		super(name, price, color, katati);
		this.makerName = makerName;
	}
	
	//メゾット
	public String getMakerName() {return this.makerName;}

	@Override
	public void setWeight() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
  
}
