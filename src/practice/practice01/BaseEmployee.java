package practice.practice01;

import capital.practice01.EmployeeInterFace;

//インタフェースを実装する
public abstract class BaseEmployee implements EmployeeInterFace {
	// 設計
	private String name; // 名前
	int age; // 年齢
	int monthlySalary; // 月給
	
	// コンストラクト
	public BaseEmployee(String name, int age, int monthlySalary) {
		this.name = name;
		this.age = age;
		this.monthlySalary = monthlySalary;
	}
	
	//給与を計算するメソッド
	public int calculateSalary(int monthlySalary) {
		// 月給に１０％かけた値を引く、その結果を給与として返す
		int salary = (int) (this.monthlySalary - (monthlySalary * 0.1));
		return salary;
	}
	
	// 年棒
	
	
	// 名前を返すオーバーライド；
	public String getName() {
		return this.name;
	}
	
	// ボーナスを計算する抽象メソッド
	public abstract int calculateBonus();

}
