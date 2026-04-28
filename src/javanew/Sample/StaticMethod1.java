package javanew.Sample;

class MathUtils {
	// 2つの整数の和を計算する静的メソッド add
	// static をつけることで、クラスから直接呼び出せるようになります
	static int add(int a, int b) {
		return a + b;
	}
}

public class StaticMethod1 {
	public static void main(String[] args) {
		// 静的メソッドの呼び出し
		// 「クラス名.メソッド名」で実行します
		int result = MathUtils.add(10, 58);

		// 結果の表示
		System.out.println("計算結果: " + result);
	}

}
