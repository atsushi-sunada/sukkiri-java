package practice.practice01;

public class Main {
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
		m1.getSubordinate();
		System.out.println("部長:" + m2.getName() + " 給与:" + m2.calculateSalary() + " 年棒:" + m2.calculateAnnualSalary());
		m2.getSubordinate();

	}

}
