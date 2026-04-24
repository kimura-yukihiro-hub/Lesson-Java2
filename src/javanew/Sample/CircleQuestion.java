package javanew.Sample;

class Circle {
	double radius;

	//コンストラクタ
	Circle(double radius) {
		this.radius = radius;
	}

	//面積を計算して表示するメソッド
	void showArea() {
		//面積 = 半径*半径*π
		double area = this.radius * this.radius * Math.PI;
		System.out.println("半径:" + this.radius + "の面積は" + area);
	}
}

public class CircleQuestion {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);

		//面積を表示
		circle.showArea();

	}

}
