package javanew.Sample;

public class Incomplete {
	public static String repeat(String word, int times) {
		String result = ""; //結果を格納する変数(空文字で初期化)
		for (int i = 0; i < times; i++) {
			result += word; //文字列を連結していく
		}
		return result;
	}
	public static void main(String[] args) {
		//メソッドを呼び出し、結果を受け取って表示
		String repeatedWord = repeat("Java", 3);
		System.out.println(repeatedWord);
	}

}
