package javanew.Sample;

public class Exception6 {
	public static void main(String[] args) {
		try {
			int[] nums = { 1, 2, 3, 4 };
			System.out.println(nums[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外です");
		}
	}

}
