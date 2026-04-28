package javanew.Sample;

//インターフェース Movable の定義
interface Movable {
	// インターフェースのメソッドは自動的に public abstract になります
	void move();
}

//Movable を実装する Car クラス
class Car8 implements Movable {
	@Override
	public void move() {
		System.out.println("車が道路を走ります。");
	}
}

//Movable を実装する Bicycle クラス
class Bycicle implements Movable {
	@Override
	public void move() {
		System.out.println("自転車がペダルで進みます。");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		Movable car = new Car8();
		Movable bike = new Bycicle();

		car.move();
		bike.move();
	}

}
