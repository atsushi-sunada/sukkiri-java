package chapter15.task15_5;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
	public static void main(String[] aegs) {
//		現在時間の取得
		LocalDate l = LocalDate.now();
//		現在に100を足す
		LocalDate m = l.plusDays(100);
//		指定された書式を指定
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(m.format(f));
		
//		SimpleDateFormat f2 = new SimpleDateFormat("西暦yyyy年MM月dd日");
//		System.out.println(f2.format(m));
	}

}
