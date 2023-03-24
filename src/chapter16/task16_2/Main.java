package chapter16.task16_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> h = new ArrayList<Hero>();
		h.add(h1);
		h.add(h2);
		for (Hero e : h) {
			System.out.println(e.getName());
		}
	}
	

}
