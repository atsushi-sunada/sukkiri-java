package chapter16.task16_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> h = new HashMap<Hero, Integer>();
		h.put(h1,3);
		h.put(h2,7);
		for(Hero key : h.keySet()) {
			int value = h.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
		
		
	}

}
