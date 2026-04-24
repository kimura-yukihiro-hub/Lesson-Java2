package javanew.Sample;

class Person {
	String name;
	int age;

	//コンストラクタ:名前と年齢を初期化する
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayInfo() {
		System.out.println("名前:" + this.name + ",年齢: " + this.age);
	}
}

public class Initialization {
	public static void main(String[] args) {
		Person person = new Person("田中太郎", 25);

		//フィールド値を表示
		person.displayInfo();
	}
}
