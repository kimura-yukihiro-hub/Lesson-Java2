package javanew.Sample;

class MathConstants {
	public static final double PI = 3.14;
}

public class Constant1 {
	public static void main(String[] args) {
		double radius = 5.0;
		// 定数 PI を使用して面積を計算（半径 × 半径 × 円周率）
		double area = radius * radius * MathConstants.PI;

		System.out.println("半径 " + radius + " の円の面積は: " + area);
	}

}
