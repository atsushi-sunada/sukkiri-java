package chapter13.task;

public class Wand {
	private String name;
	private double power;
	
	public void setPower(double power) {
		if(power < 0.5 || power > 100.0 ) {
			throw new IllegalArgumentException("杖の魔力が有効ではありません");
		}
		this.power = power;
	}
	public double getPower() {
		return this.power;
	}
	
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖の名前が有効ではありません");
		}
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	

}
