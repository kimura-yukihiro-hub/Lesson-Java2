package javanew.Sample;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			System.out.println("try ブロック開始");
			throw new RuntimeException("エラー発生");
		}catch (Exception e) {
			System.out.println("catch ブロック:" + e.getMessage());
		}finally {
			System.out.println("finally ブロック")	;
		}
		System.out.println("プログラム終了");
	}

}
