package chapter_8;

public class Hero {
	String name;
	int hp;
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name +"眠っていました");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った");
	}
	
	
	
	

}
