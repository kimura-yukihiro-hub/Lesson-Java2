package javanew.Sample;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println("計算結果:" + result);
		}catch (ArithmeticException e) {
			System.out.println("例外が発生しました:" + e.getMessage());
		}
		System.out.println("プログラム終了");
	}

}
