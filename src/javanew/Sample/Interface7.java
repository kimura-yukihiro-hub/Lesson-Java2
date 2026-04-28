package javanew.Sample;

interface Shape3 {
	double calculateArea();
}

class Circle5 implements Shape3 {
	private double radius;
	
	public Circle5(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle4 implements Shape3 {
	private double width;
	private double height;
	
	public Rectangle4(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}
public class Interface7 {
	public static void main(String[] args) {
		Shape3 cir = new Circle5(5.0);
		Shape3 rec = new Rectangle4(3.0, 4.0);
		
		System.out.println("円の面積:" + cir.calculateArea());
		System.out.println("長方形の面積:" + rec.calculateArea());
	}

}
