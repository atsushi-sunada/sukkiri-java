package practice.web02;

public class Item {
	public String name;
	public int price;
	
	
	//コンストラクタ
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public boolean equals(Object o) {
		
		//引数OBJがnullの場合はfalseを返す
		if(o == null) {
			return false;
		}
		
		//引数OBJがITEM型のインスタンスかどうかcheckする
		if(o instanceof Item) {
			//ITEM型に変更
			Item item = (Item)o;
			
			//２つのインスタンスのいずれかのnameがnullならfalseを返す
			if(item.name == null || this.name == null) {
				return false;
			}
			
			//２つのインスタンスのname,priceが同じならtrueを返す
			if(item.name.equals(this.name) && item.price == this.price) {
				return true;
			}
			return false;
		} else {
			return false;
		}
		
	}
	
	public String toString() {
		return "商品名:" + this.name + "価格：" + this.price; 
	}

}
