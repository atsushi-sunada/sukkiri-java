package practice.practice01;

// ベースを継承する
public class Manager extends BaseEmployee {

	// 従業員リスト

	int subordinates;
	Employee []oldemp = new Employee[subordinates]; //　元からある箱

	// コンストラクト

	public Manager(String name, int age, int monthlySalary, int subordinates) {
		this(name, subordinates, subordinates);
		this.subordinates = subordinates;
	}

	public Manager(String name, int age, int monthlySalary) {
		super(name, age, monthlySalary);
	}

	//月給の計算
	public int calculateSalary() {
		return super.calculateSalary(monthlySalary);
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
		return subordinates;

	}

	/*
	 * 部下の追加
	 * リストの数を増やしていく
	 * 箱の0から順番に格納していく
	 * もし、箱の大きさが部下の数を超えると箱の大きさを大きくする
	 */

	public Employee[] addSubordinate(Employee e) {
		//		if (oldemp.length < subordinates) {
		Employee newemp[] = new Employee[oldemp.length + 1];
		System.arraycopy(oldemp, 0, newemp, 0, oldemp.length); // oldempの内容をold0からnew0に個数分コピーする
		//			追加後に配列の後ろに代入する
		newemp[oldemp.length] = e;
		subordinates++;
		return newemp;
	}

	/*
	 * 部下のリストを返す
	 * 
	 */

	public void getSubordinate() {
		System.out.println(this.addSubordinate(null));
	}

	//			for (int i = 0; i < emp.size(); i++) {
	//				System.out.println("部下:" + emp.get(i).getName() + " 給与:" + emp.get(i).calculateSalary() + " 年棒:" + emp.get(i).calculateAnnualSalary());
	//			}
	//				System.out.println("==============================================");
}
