package javanew.Sample;

import java.util.HashMap;

public class HashQuestion2 {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("Apple", "りんご");
		dictionary.put("Banana", "バナナ");
		dictionary.put("cherry", "サクランボ");

		String targetKey = "Apple";
		String value = dictionary.get(targetKey);
		if (value != null) {
			System.out.println(targetKey + "の意味は" + value + "です。");
		} else {
			System.out.println(targetKey + "は辞書に登録されていません。");
		}
	}

}
