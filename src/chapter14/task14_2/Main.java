package chapter14.task14_2;

public class Main {
	public static void main(String[] args) {
		Cleric c = new Cleric("クレリック", 50, 10);

		c.selfAid();
		c.pray(3);
	}

}
