package javanew.Sample;

public class OverLoad1 {
	//2つの整数の和を計算するメソッド
	public static int add(int a,int b) {
		return a + b;
	}
	//3つの整数の和を計算するメソッド
	public static int add(int a,int b, int c) {
		return a + b + c;
	}
	public static void main(String[] args) {
		//メソッドの呼び出しと結果の表示
		int result2 = add(10, 20);
		int result3 = add(10, 20, 30);
		System.out.println("2つの整数の和: " + result2);
		System.out.println("3つの整数の和: " + result3);
	}

}
