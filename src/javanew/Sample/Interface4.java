package javanew.Sample;

interface MathConstants1 {
	// 定数の定義（自動的に public static final になります）
	double PI = 3.14159;
}

class Circle3 implements MathConstants1 {
	private double radius;
	
	public Circle3(double radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		double area = radius * radius * PI;
		System.out.println("半径 " + radius + " の円の面積: " + area);
	}
}
public class Interface4 {
	public static void main(String[] args) {
		Circle3 myCircle = new Circle3(5.0);
		
		myCircle.calculateArea();
	}

}
