package javanew.Sample;

class Animal {
	void makeSound() {
		System.out.println("動物の鳴き声");
	}
}

class Doges extends Animal {
	@Override
	void makeSound() {
		System.out.println("Woof!");
	}
}

class Cats extends Animal {
	@Override
	void makeSound() {
		System.out.println("にゃー!");
	}
}
public class Animals {
	public static void main(String[] args) {
		Doges dog = new Doges();
		Cats cat = new Cats();
		dog.makeSound();
		cat.makeSound();
	}

}
