package practice.youtube02;

//設計クラス
//オブジェクトクラス

public class Student {
	
	public String name;
	
	
	//コンストラクタ
	public Student(String name) {
		this.name = name;
	}
		

	//オーバーライド
	public String toString() {
		return "私の名前は" + name + "です";
	}
	

}
