package javanew.Sample;

abstract class Vehicle {
	public abstract void move();
}

class Car5 extends Vehicle {
	@Override
	public void move() {
		System.out.println("ブォンブォン!");
	}
}
public class AbstractSample2 {
	public static void main(String[] args) {
		Vehicle myCar = new Car5();
		
		myCar.move();
	}

}
