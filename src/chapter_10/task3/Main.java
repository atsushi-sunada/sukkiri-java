package chapter_10.task3;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト",50,10);
		PoisonMatango pm = new PoisonMatango('A');
		PoisonMatango pm2 = new PoisonMatango('B',50);
		pm.attack(h);
		pm2.attack(h);
	}

}
