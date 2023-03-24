package chapter15.practice;

public class Player {
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public boolean isPlayer(String name) {
		if (name.length() != 8) {
			return false;
		}
		char first = name.charAt(0);
		if (!(first >= 'A' && first <= 'Z')) {
			return false;
		}
		for (int i = 0; i < 8; i++) {
			char c = name.charAt(i);
			if (!(c >= 'A' && c <= 'z') || (c >= 'O' && c <= '9')) {
				return false;
			}
		}
		return false;
	}
	
	public boolean ismagic(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
