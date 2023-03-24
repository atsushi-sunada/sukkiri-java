package chapter15.task15_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		// 現在の日時を取得
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		
		
		//取得した日時情報をCalenderにセット
		c.setTime(d);
		// calendarから日の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		// 取得した値に１００足し、calendarにセット
		day += 100;
		// calendarをDate型に変換
		Date m = c.getTime();
		// simpledatecalenderを用いて、指定された形式でDateインスタンスの内容を表示
		SimpleDateFormat f = 
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(m));
	}

}
