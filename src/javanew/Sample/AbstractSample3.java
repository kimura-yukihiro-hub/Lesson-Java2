package javanew.Sample;

abstract class Animals3 {
	public abstract void makeSound();
	
	public void sleep() {
		System.out.println("眠っている");
	}
}

class Dog8 extends Animals3 {
	@Override
	public void makeSound() {
		System.out.println("ワンワン！");
	}
}
public class AbstractSample3 {
	public static void main(String[] args) {
		Animals3 myDog = new Dog8();

		myDog.makeSound();
		myDog.sleep();
	}

}
