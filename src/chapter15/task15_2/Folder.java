package chapter15.task15_2;

import java.nio.file.Files;

public class Folder {
	
	public static String concatPath(String folder, Files  f) { // 結合メソッド
		if (!folder.endsWith("\\")) { // \で終わるかどうか
			folder += "\\";
		}
		return folder + f;
	}
	

}
