package javanew.Sample;

public class Person1 {
	
	String name;
	int age;
	
	//コンストラクターの定義
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
//メソッド
	public void displayInfo() {
		System.out.println("名前は" + name + "です。年齢は" +age + "歳です。");
	}
}


