package capital.practice01;

/* インタフェース
 * 給料を計算するメソッド
 * 年棒を計算するメソッド
 * 名前を返すメソッド
 */

public interface EmployeeInterFace {
	public abstract int calculateSalary(); // 給与

	public abstract int calculateAnnualSalary(); // 年棒

	public abstract String getName(); // 名前

}
