package javanew.Sample;

interface Animals4 {
	void makeSound();
}

class Dog9 implements Animals4 {
	@Override
	public void makeSound() {
		System.out.println("ワンワン!");
	}
}
public class Interface2 {
	public static void main(String[] args) {
		Dog9  myDog = new Dog9();
		myDog.makeSound();
	}
}


