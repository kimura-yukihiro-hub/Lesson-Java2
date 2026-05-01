package javanew.Sample;

import java.util.ArrayList;

public class Test8 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("リンゴ");
		fruits.add("バナナ");
		fruits.add("さくらんぼ");
		System.out.println("元のリスト:" + fruits);
		fruits.remove("バナナ");
		System.out.println("削除後のリスト:" + fruits);
		fruits.add("オレンジ");
		System.out.println("追加後のリスト:" + fruits);

	}
}
