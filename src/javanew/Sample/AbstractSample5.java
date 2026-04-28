package javanew.Sample;

abstract class Shape1 {
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
}
class Rectangle3 extends Shape1 {
	private double width;
	private double height;
	
	public Rectangle3(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * (width + height);
	}
}

public class AbstractSample5 {
	public static void main(String[] args) {
		Rectangle3 rect = new Rectangle3(5.0, 10.0);
		
		System.out.println("面積:" + rect.calculateArea());
		System.out.println("周囲長:" + rect.calculatePerimeter());
	}

}
