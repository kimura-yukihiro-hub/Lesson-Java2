package javanew.Sample;

class Parent {
	protected void sayHello() {
		System.out.println("親クラスのprotectedメソッドが呼ばれました!");
	}
}
class Child extends Parent{
	public void callParemtMethod() {
		sayHello();
		System.out.println("子クラスから親のメソッドを呼び出しました。");
	}
}
public class AccessControl3 {
	public static void main(String[] args) {
		Child child = new Child();
		child.callParemtMethod();
	}

}
