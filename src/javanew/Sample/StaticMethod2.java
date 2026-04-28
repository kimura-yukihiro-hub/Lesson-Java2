package javanew.Sample;

class StringUtils {
	static String toUpperCase(String str) {
		return str.toUpperCase();
	}
}

public class StaticMethod2 {
	public static void main(String[] args) {
		String original = "a-force";

		String result = StringUtils.toUpperCase(original);

		System.out.println("変換前: " + original);
		System.out.println("変換後: " + result);
	}

}
