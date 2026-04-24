package javanew.Sample;

public class Cat {
	String name;

	void merow() {
		System.out.println(name + "が鳴いた!");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "タマ";
		cat.merow();

	}

}
