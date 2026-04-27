package javanew.Sample;

class Animal3 {
	void eat() {
		System.out.println("動物が食事をします");
	}
}

class Dog4 extends Animal3 {
	void vark() {
		System.out.println("ワンワン!");
	}
}
public class Cast2 {
	public static void main(String[] args) {
		Animal3 myAnimal = new Dog4();
		//Animal3型のままではvark()は呼べない
		//Animal3型の変数をDog4	型にキャスト (ダウンキャスト)
		Dog4 myDog = (Dog4) myAnimal;
		//Dog4クラスのメソッドを呼び出す
		myDog.vark();
		myDog.eat(); //親クラスのメソッドも呼べる
	}

}
