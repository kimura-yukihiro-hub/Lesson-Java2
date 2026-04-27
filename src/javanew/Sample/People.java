package javanew.Sample;


class Person2 {
	String name;
	int age;
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "名前:" + name + ",年齢:" + age;
	}
}
public class People {
	public static void main(String[] args) {
		Person2 person = new Person2("田中太郎", 25);
		System.out.println(person);
	}

}
