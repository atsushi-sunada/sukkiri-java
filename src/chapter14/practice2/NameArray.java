package chapter14.practice2;

public class NameArray {
	
	//コマンドラインから入力された名前が、配列nameに含まれているかを調べるプログラムを作成
	public static void main(String[] args) {
		String [] names = {"桜井", "田原", "中川", "鈴木"};
		String search = args[0];
		int i;
		
		for(i = 0; i < names.length; i++) {
			
			//コマンドライン引数と配列の中の値が同じかを条件分岐し、同じであればtrueを返す
			if(search.equals(names[i])) {//文字列が同じかどうか
				break;
			}
		}
		if(i < names.length) {
			System.out.println(search + "は含まれていません");
		} else {
			System.out.println(search + "は含まれていません");
		}
	}

}
