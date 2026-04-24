package javanew.Sample;

public class NumberCheck {
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	public static void main(String[] args) {
		int test1 = 10;
		int test2 = 11;
		
		System.out.println(test1 + "は偶数ですか？:" + isEven(test1));
		System.out.println(test2 + "は偶数ですか？:" + isEven(test2));
	}

}
