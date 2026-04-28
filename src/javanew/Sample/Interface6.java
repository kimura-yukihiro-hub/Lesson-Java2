package javanew.Sample;

interface A {
	default void message() {
		System.out.println("かっこいい");
	}
}

interface B {
	default void message() {
		System.out.println("優しい");
	}
}

class C implements A, B {
	@Override
	public void message() {
		System.out.println("クラス C で競合を解決しました。独自のメッセージです。");
	}
}
public class Interface6 {
	public static void main(String[] args) {
		C obj = new C();
		obj.message();
	}

}
