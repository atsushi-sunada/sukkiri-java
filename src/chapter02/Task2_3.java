package chapter02;

public class Task2_3 {
	// Funatsu:字下げ文字をタブか半角スペースどちらかに揃えましょう
	public static void main(String[] args) { 
	    System.out.println("ようこそ占いの館へ");
	    System.out.println("あなたの名前を入力してください");
	    String name = new java.util.Scanner(System.in).nextLine(); 
	    
	    System.out.println("あなたの年齢を入力してください");
	    String ageString = new java.util.Scanner(System.in).nextLine();
	    int age = Integer.parseInt(ageString);
	    
	    int fortune = new java.util.Random().nextInt(3);
	    fortune++;
	    
	    System.out.println("占い結果が出ました！");
	    System.out.println(age + "歳の" + name + "さん、あなたの運勢番号は" + fortune + "です");
	    System.out.println("1:大吉2:中吉3:吉4:凶");
	    
	}

}
