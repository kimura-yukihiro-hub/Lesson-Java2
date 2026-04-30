package javanew.Sample;

public class Exception5 {
	public static void main(String[] args) {
		int num = 10;
		try {
		int result = num / 0;
		System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("0で割ることはできません");
		}
	}

}
