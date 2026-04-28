package javanew.Sample;

interface Animals5 {
	void makeSound();
}
interface Flyable {
	void fly();
}

class Bird implements Animals5, Flyable {
	@Override
	public void makeSound() {
		System.out.println("チュンチュン!");
	}
	
	@Override
	public void fly() {
		System.out.println("鳥が大空を飛びます。");
	}
}
public class Interface3 {
	public static void main(String[] args) {
		Bird myBird = new Bird();
		myBird.makeSound();
		myBird.fly();
	}

}
