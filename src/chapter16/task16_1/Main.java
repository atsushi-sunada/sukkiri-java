package chapter16.task16_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Prefecture p1 = new Prefecture("大阪");
		Prefecture p2 = new Prefecture("滋賀");
		Prefecture p3 = new Prefecture("三重");
		Prefecture p4 = new Prefecture("京都");
		Prefecture p5 = new Prefecture("兵庫");
		Prefecture p6 = new Prefecture("和歌山");
		Prefecture p7 = new Prefecture("奈良");
		
		Set<Prefecture> s = new HashSet<Prefecture>();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		s.add(p5);
		s.add(p6);
		s.add(p7);
		for (Prefecture o : s) {
			System.out.println("近畿地方：" + o.getName());
		}
		
		Student t1 = new Student("田中",100);
		Student t2 = new Student("鈴木",40);
		Student t3 = new Student("菅原",70);
		Student t4 = new Student("中村",10);
		Student t5 = new Student("木村",60);
		
		Student [] sss = {t1,t2,t3,t4,t5};
		
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(t1.test);
		c.add(t2.test);
		c.add(t3.test);
		c.add(t4.test);
		c.add(t5.test);
		for (Integer ss : c) {
			System.out.println("テストの点数は" + ss);
		}	
		
		Map<String, Integer> so = new HashMap<String,Integer>();
		so.put("伊藤", 861);
		so.put("黒田", 544);
		so.put("山縣", 499);
		so.put("松方", 461);
		so.put("大重", 132);
		
		for (String key : so.keySet()) {
			Integer value = so.get(key);
			System.out.println("首相名：" + key + " 任期：" + value);
		}
		
		
	}

}
