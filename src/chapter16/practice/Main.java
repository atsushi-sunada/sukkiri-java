package chapter16.practice;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(55);
		a.add(43);
		
		//上書き
		a.set(0, 45);
		
		for (int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		//拡張
		for (int s : a) {
			System.out.println(s);
		}
	}

}
