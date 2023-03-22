package practice.web02;

public class Main {
	public static void main(String[] args) {
		Item item1 = new Item("リンゴ",100);
		Item item2 = new Item("みかん",200);
		System.out.println(item1);
		System.out.println(item2.toString());
		System.out.println(item1.equals(item2));
	}

}
