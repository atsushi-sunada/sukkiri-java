package chapter05;

public class Task5_4 {
	public static void main(String[] args) {
		double traiangl = calcTriangleArea(10.0, 5.0);
		double circle = calcCircleArea(5);    // Funatsu:自動型変換するのでエラーにはなりませんが、引数の型と合う値を入れてあげましょう

		System.out.println("三角形の面積は" + traiangl);
		System.out.println("円の面積" + circle);
	}

	public static double calcTriangleArea(double bottom, double heigth) {
		double traiangl = bottom * heigth / 2;
		return traiangl;
	}

	public static double calcCircleArea(double rabius) {
		double circle = rabius * rabius * 3.14;
		return circle;
	}

}
