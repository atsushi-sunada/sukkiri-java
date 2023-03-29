package chapter15.task15_2;

import java.nio.file.Files;

public class Folder {
	//作成した二つのファイルを結合してみる
	
	public static String concatPath(String folder, Files  f) { // 結合メソッド
		if (!folder.endsWith("\\")) { // \で終わるかどうか
			folder += "\\";
		}
		return folder + f;
	}
	

}
