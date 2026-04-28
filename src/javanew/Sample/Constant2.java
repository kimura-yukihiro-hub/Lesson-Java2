package javanew.Sample;

class PhysicsConstants {
	// 光速を定数として定義 (単位: km/s)
	// すべて大文字で、単語の間をアンダースコアで繋ぐのが定数の命名ルールです
	public static final int SPEED_OF_LIGHT = 299792;
}

public class Constant2 {
	public static void main(String[] args) {
		int second = 1;
		int distance = PhysicsConstants.SPEED_OF_LIGHT * second;

		System.out.println("光が " + second + " 秒間に進む距離は " + distance + " km です。");

	}

}
