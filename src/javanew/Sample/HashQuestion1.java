package javanew.Sample;

import java.util.HashMap;
import java.util.Map;

public class HashQuestion1 {
	public static void main (String[] args) {
		HashMap<String, Integer> items = new HashMap<>();
		items.put("リンゴ", 150);
		items.put("バナナ", 100);
		items.put("メロン", 800);
		
		System.out.println("在庫一覧");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println(entry.getKey() + "の価格は" + entry.getValue() + "円です。");
		}
	}

}
