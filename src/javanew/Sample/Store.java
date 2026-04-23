package javanew.Sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
	public static void main(String[] args) {
		Map<String, Integer> store = new HashMap<>();
		store.put("りんご", 100);
		store.put("みかん", 80);
		store.put("バナナ", 120);
		store.put("いちご", 300);

		//キーボードからの入力を受け取る準備
		Scanner scanner = new Scanner(System.in);
		System.out.print("商品名を入力してください:");
		String input = scanner.nextLine();

		//登録されているか確認して表示
		if (store.containsKey(input)) {
			//登録されている場合
			System.out.println(input + "の価格は" + store.get(input) + "円です。");
		} else {
			//登録されていない場合
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
		scanner.close();
	}

}
