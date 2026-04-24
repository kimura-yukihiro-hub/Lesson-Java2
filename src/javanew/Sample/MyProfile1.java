package javanew.Sample;

class Profile {
	String name;
	int age;

	void showInfo() {
		System.out.println("私の名前は、" + name + "です。" + "歳は、" + age + "歳です。よろしくお願いします。");
	}
}

public class MyProfile1 {
	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.name = "木村倖大";
		profile.age = 24;
		profile.showInfo();
	}
}
