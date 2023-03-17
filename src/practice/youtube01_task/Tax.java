package practice.youtube01_task;

public class Tax extends Car {
	private int price;
	
	
	//noのコンストラクタの指定は親クラスが持っているため呼び出す
	public Tax(int no,int price) {
		super(no);
		this.price = price;
	}
	
    public Tax(int no) {
    	this(no,500);
		
	}
	
	public void start() {
		
	}
	public void run() {
		
	}
	
	public void display() {
		super.display();
		System.out.println("料金は" + this.price + "です");
		
	}
	
	

}
