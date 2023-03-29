package practice.practice01;

public class Employee extends BaseEmployee {

	public Employee(String name, int age, int monthlySalary) {
		super(name, age, monthlySalary);
	}

/* オーバーライドするメソッド
 * １，ボーナスの計算する
 * ２，年棒を計算する
 * 
 */
	
	/*
	 * 月給を求めるメソッド
	 * 親クラスと内容は変わらない
	 */
	public int calculateSalary() {
		return super.calculateSalary(this.monthlySalary);
	}
/*
 * 年棒を計算する
 * 12か月の給与とボーナスを合わせた結果を返す
 */
	public int calculateAnnualSalary() {
		int AnnuaSalary =  this.calculateSalary() * 12 + this.calculateBonus();
		return AnnuaSalary;
	}
	
	/*
	 * ボーナスを計算する
	 * 月給の2か月分を計算する
	 */

	public int calculateBonus() {
		int Bonus =  this.calculateSalary() * 2;
		return Bonus;
	}
}