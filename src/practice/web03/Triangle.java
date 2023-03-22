package practice.web03;

public class Triangle {
	public int bottom;
	public int height;
	
	public Triangle(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	public String toString() {
		return "底辺：" + this.bottom + "高さ：" + this.height + "面積" + this.bottom * this.height/2;
		
	}
	
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o instanceof Triangle) {
			Triangle Triangle = (Triangle)o;
			if(Triangle.bottom == this.bottom && Triangle.height == this.height) {
				return true;
			} else {
				return false;
			}
		} return false;
		//obj型がTriangle型かどうか確認一緒
		//trueならTriangle型にキャストする
		//引数ojsのbottom.heightが自身のインスタンスと同じ値ならばtrueを返す
		
		
	}

}
