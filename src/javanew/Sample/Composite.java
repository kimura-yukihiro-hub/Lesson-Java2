package javanew.Sample;

class Horse {
	String model;

	void ride() {
		System.out.println(model + "が走り出しました!");
	}
}

class Fish {
	String name;
	
	void swim() {
		System.out.println(name + "が泳いでいます");
	}
}
public class Composite {
	public static void main(String[] args) {
		Horse horse = new Horse();
		Fish fish = new Fish();
		horse.model = "ディープインパクト";
		fish.name = "太刀魚";
		horse.ride();
		fish.swim();
	}

}
