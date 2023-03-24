package chapter15.task15_2;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		
		try {
			File f = new File("C:/pleiades/2022-12/workspace/suttkiri-java2/src/chapter15/task15_2/redome.txt");
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
