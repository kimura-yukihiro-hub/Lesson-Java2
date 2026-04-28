package javanew.Sample;

//抽象クラス Animal の定義
abstract class Animals2 {
	// 抽象メソッド（具体的な処理は書かず、セミコロンで終わる）
	public abstract void makeSound();
}

//Dog クラスでの実装
class Dog7 extends Animals2 {
	@Override
	public void makeSound() {
		System.out.println("ワンワン！");
	}
}

//Cat クラスでの実装
class Cat3 extends Animals2 {
	@Override
	public void makeSound() {
		System.out.println("ニャー!");
	}
}
public class AbstractSample1 {
	public static void main(String[] args) {
		Animals2 myDog = new Dog7();
		Animals2 myCat = new Cat3();
		
		myDog.makeSound();
		myCat.makeSound();
	}

}
