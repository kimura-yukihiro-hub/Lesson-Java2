package javanew.Sample;

class Animals1 {
	protected void makeSound() {
		System.out.println("動物の鳴き声がする。");
	}
}

class Dog6 extends Animals1 {
	@Override
	public void makeSound() {
		System.out.println("ワンワン!");
	}
}
public class AccessControl4 {
	public static void main(String[] args) {
		Dog6 myDog = new Dog6();
		
		myDog.makeSound();
	}

}
