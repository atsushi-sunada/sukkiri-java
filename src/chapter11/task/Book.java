package chapter11.task;

public class Book extends TangibleAsset {
	String isbn;
	
	//コンストラクタ
	public Book (String name, int price, String color, boolean katati, String isbn) {
		super(name, price, color, katati);
		this.isbn = isbn;
	}
	
	//メゾット
	public String getIsbn() {return this.isbn;}

	@Override
	public void setWeight() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
