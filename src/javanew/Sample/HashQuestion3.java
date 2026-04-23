package javanew.Sample;

import java.util.HashSet;

public class HashQuestion3 {
	public static void main(String[] args) {
		HashSet<String> language = new HashSet<>();
		language.add("Java");
		language.add("Python");
		language.add("Java");
		language.add("Ruby");
		language.add("Python");

		System.out.println("重複を除いた結果");
		for (String lang : language) {
			System.out.println(lang);
		}
	}

}
