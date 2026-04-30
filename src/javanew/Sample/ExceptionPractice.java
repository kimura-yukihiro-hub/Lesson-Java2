package javanew.Sample;

public class ExceptionPractice {
	public static void main(String[] args) {
		//String str = null;
		//1.
		//		try {
		//			System.out.println(str.length());
		//		} catch (NullPointerException e) {
		//			System.out.println("ヌルポが発生しました:" + e.getMessage());
		//		}
		//2.
		//		try {
		//			int[] nums  = {1, 2, 3, 4, 5};
		//			System.out.println(nums[5]);
		//		}catch (NullPointerException e) {
		//			System.out.println("ヌルポが発生しました:" + e.getMessage());
		//		}
		//System.out.println("プログラムは継続します");
		//3.
		try {
			int age = 15;
			if (age < 18) {
				throw new IllegalArgumentException("18歳未満は登録できません。");
			}
			System.out.println("登録が完了しました。");
		} catch (IllegalArgumentException e) {
			System.out.println("例外が発生しました:" + e.getMessage());
		}
	}
}
