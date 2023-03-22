package practice.youtube01;

public class Student extends Parson{
	int stuNo;
	//継承名前フィールド
	
	public Student(String name) {
		this(name, 999); //クラス内のコンストラクタ呼び出し
	}
	
	//コンストラクタ
	public Student(String name,int stuNo) {
		super(name); //スーパークラスのコンストラクタを呼び出し
		this.stuNo = stuNo;
	}
	
	public void display() {
		super.display();
		System.out.println("学籍番号" + stuNo);
	}


}
