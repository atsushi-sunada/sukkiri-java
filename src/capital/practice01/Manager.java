package capital.practice01;

import java.util.ArrayList;

// ベースを継承する
public class Manager extends BaseEmployee {

	// 従業員リスト
	ArrayList<Employee> subordinates;

	//	int subordinates;
	//	Employee oldemp [] = new Employee[subordinates];

	// コンストラクト
	public Manager(String name, int age, int monthlySalary) {
		super(name, age, monthlySalary);
		subordinates = new ArrayList<Employee>();

	}

	//月給の計算
	public int calculateSalary() {
		return super.calculateSalary();
	}

	/*
	 *  年棒の計算
	 *  12か月分の給与とボーナスを合した数値
	 * 
	 */
	public int calculateAnnualSalary() {
		int AnnuaSalary = this.calculateSalary() * 12 + this.calculateBonus();
		return AnnuaSalary;
	}

	/*
	 * ボーナスの計算
	 * 部下全員の給与の２０％をボーナスとして返す
	 * 部下リストにはいっている部下の給料を繰り返し文で合計を出す
	 * 合計から20%をの結果を出す
	 * 
	 */

	public int calculateBonus() {
		int Bonus = 0;
		for (int i = 0; i < subordinates.size(); i++) {
			Bonus += subordinates.get(i).calculateSalary();
		}
		Bonus = (int) (Bonus * 0.2);

		return Bonus;
	}

	/*
	 * 部下の追加
	 * リストの数を増やしていく
	 * 箱の0から順番に格納していく
	 * もし、箱の大きさが部下の数を超えると箱の大きさを大きくする
	 */

	public void addSubordinate(Employee e) { // 引数にインターフェースをうけとることで変化に強くすることもできる
		subordinates.add(e);

		//		for(int i = 0; i< emp.length; i++) {
		//			emp[i] = e;
		//		}
		//		if (emp.length <  subordinates) {
		//			subordinates ++;
		//			emp[subordinates] = e;
		//		} else {
		//			emp[subordinates] = e;
		//		}		
	}

	/*
	 * 部下のリストを返す
	 * 
	 */

	public ArrayList<Employee> getSubordinate() {
		return this.subordinates;

		//		for (int i = 0; i < subordinates.size(); i++) {
		//			System.out.println("部下:" + subordinates.get(i).getName() + " 給与:" + subordinates.get(i).calculateSalary() + " 年棒:" + subordinates.get(i).calculateAnnualSalary());
		//		}
		//			System.out.println("==============================================");
	}

}
