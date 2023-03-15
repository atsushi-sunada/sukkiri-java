package chapter_11.practice3;

//インターフェースを実装してクラスを作る
//実装：未定だったメゾットを確定させる→使われるのはオーバーライドで確定させるから
public class KyotoCleaningShop implements  CleaningService {
	String ownerName;
	String address;
	String phone;
	
	public Shirt washShirt(Shirt s) { //戻り値がクラス型数
		return s;
		
	}
	
	public Towl washTowl(Towl t) {
		return t;
	}
	
	public Coat washCoat(Coat c) {
		return c;
	}

}
