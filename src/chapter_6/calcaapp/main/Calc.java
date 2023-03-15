package chapter_6.calcaapp.main;
import chapter_6.calcapp.logics.calckensyo;

public class Calc {
	public static void main(String[] args) {
		int koku = 10;
		int san = 20;
		int riee = 20;
		int sya = 30;
		int total = chapter_6.calcapp.logics.calclogic.tasu(koku, san, riee, sya); 
		int delta = chapter_6.calcapp.logics.calclogic.hikaru(koku,san,riee,sya);
		System.out.println("足すと"+ total + "引くと"+ delta);
		
		int c = total; 
		int d = delta;
		
		calckensyo.knnsyo(c,d);
	}

}
