package chapter03;

public class Task3_5 {
	// Funatsu:字下げ文字をタブか半角スペースどちらかに揃えましょう
	public static void main(String[] args) { 
	    System.out.println("[メニュー]１：検索　２：登録　３：削除　４：変更");
	    int selected = new java.util.Scanner(System.in).nextInt();
	    switch(selected) {
	        case 1:
	            System.out.println("検索します");
	            break;
	        case 2:
	            System.out.println("登録します");
	            break;
	        case 3:
	            System.out.println("削除します");
	            break;
	        case 4:
	            System.out.println("変更します");
	            break;
	        // 1〜4以外の時だけ「1〜4を選ばないと、何もしないよ！」を表示させてください
	    }
	}

}
