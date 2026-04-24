package javanew.Sample;

class Dog {
	String name;
	void showName() {
		System.out.println("犬の名前は" + name + "です。");
	}
}
public class Dogs {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "ポチ";
		dog.showName();
	}

}
