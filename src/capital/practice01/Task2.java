package capital.practice01;

public class Task2 {
	public static void main(String[] args) {
		Employee e1 = new Employee("すな", 25, 200000);
		Employee e2 = new Employee("うえ", 21, 200000);
		Manager m1 = new Manager("ふく", 40, 400000);
		Manager m2 = new Manager("こふ", 20, 300000);

		m1.addSubordinate(e1);
		m1.addSubordinate(e2);
		m2.addSubordinate(e1);
		m2.addSubordinate(e2);

		System.out.println("部長:" + m1.getName() + " 給与:" + m1.calculateSalary() + " 年棒:" + m1.calculateAnnualSalary());

		for (int i = 0; i < m1.subordinates.size(); i++) {
			System.out.println(
					"部下:" + m1.subordinates.get(i).getName() + " 給与:" + m1.subordinates.get(i).calculateSalary()
							+ " 年棒:" + m1.subordinates.get(i).calculateAnnualSalary());
		}
		System.out.println("==============================================");

		System.out.println("部長:" + m2.getName() + " 給与:" + m2.calculateSalary() + " 年棒:" + m2.calculateAnnualSalary());
		for (int i = 0; i < m2.subordinates.size(); i++) {
			System.out.println(
					"部下:" + m2.subordinates.get(i).getName() + " 給与:" + m2.subordinates.get(i).calculateSalary()
							+ " 年棒:" + m2.subordinates.get(i).calculateAnnualSalary());
		}
		System.out.println("==============================================");

	}

}
