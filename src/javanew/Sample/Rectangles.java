package javanew.Sample;

class Rectangle {
	int width;
	int height;

	//コンストラクタ
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//面積を計算して表示するメソッド
	void showArea() {
		//面積　= 幅 * 高さ
		int area = this.width * this.height;
		System.out.println("幅:" + this.width + "cm,高さ:" + this.height + "cmの面積は" + area + "cmです。");
	}
}

public class Rectangles {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 6);
		//表示する
		rectangle.showArea();

	}

}
