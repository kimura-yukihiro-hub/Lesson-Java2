package javanew.Sample;

abstract class Person4 {
	String name;
	
	// コンストラクタで名前を初期化
	public Person4(String name) {
		this.name = name;
	}
	
	// 抽象メソッド
	public abstract void introduce();
}

class Student4 extends Person4 {
	public Student4(String name) {
		super(name);
	}
	// introduceメソッドをオーバーライド
	@Override
	public void introduce() {
		System.out.println("私の名前は " + name + " です。学生です。");
	}
}
public class AbstractSample4 {
	public static void main(String[] args) {
		Student4 s = new Student4("木村");
		s.introduce();
	}

}
