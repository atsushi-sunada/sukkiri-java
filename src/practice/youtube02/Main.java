package practice.youtube02;


public class Main {
	
	public static void main(String [] args) {
		
		//オブジェクトクラス
		Student stu1 = new Student("菅原");
		Student stu2 = new Student("菅原");
		//stu1とstu2のそれぞれのオブジェクトのアドレス値が同じかどうか比較	
		boolean result = stu1.equals(stu2);	
		System.out.println(result);
		
		
		
		//Stringクラス
		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		
		String a = stu1.name;
		String b = stu2.name;
		
		boolean result2 = a.equals(b);
		System.out.println(result2);
		
		//文字列をequalsメゾットを使用して比較
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//==はStringクラスではアドレス値が同じかどうか比較している
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		
	}

}
