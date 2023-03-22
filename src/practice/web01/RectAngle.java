package practice.web01;

public class RectAngle{
	int haba;
	int takasa;
	
	//コンストラクト
	public RectAngle (int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}
	
	public int getMenseki() {
		return this.haba * this.takasa;
	}
	
	
}



