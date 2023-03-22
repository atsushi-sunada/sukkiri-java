package chapter12.task;

public class Main {
	public static void main(String[] args) {
		X obj = new A();
		Y y1 = new A();
		Y y2 = new B();
		
		obj.a();
		
		y1.a();
		y2.a();
		
		Y[] y = new Y[2];	
		y[0]= new A();
		y[1] = new B();
		// Funatsu: 配列に格納するまではOKです。ここからループでb()メソッドを実行するコードを書きましょう
	}
}

/*12-2
 * 1.a();
 * 2.AaBa
 * 
 * 12-3
 * Y[]型
 * 
 */ 
