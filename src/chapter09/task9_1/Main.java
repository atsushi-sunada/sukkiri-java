package chapter09.task9_1;

public class Main {
	public static void main(String []args) {
		
		Thierf t1 = new Thierf("アサカ",40,5);
		System.out.println(t1.name + t1.hp + t1.mp);
		
		Thierf t2 = new Thierf("アサカ",35);
		System.out.println(t2.name + t2.hp + t2.mp);
		
		Thierf t3 = new Thierf("アサカ");
		System.out.println(t3.name + t3.hp + t3.mp);
			
		
	}
	

}
