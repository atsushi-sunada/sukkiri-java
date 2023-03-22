package practice.web01;

public class Main {
	public static void main(String[] args) {
		RectAngle rect = new RectAngle(8, 5);
        System.out.println(rect.getMenseki());  //①

        Square square = new Square(10);
        System.out.println(square.getMenseki());//②
	}

}
