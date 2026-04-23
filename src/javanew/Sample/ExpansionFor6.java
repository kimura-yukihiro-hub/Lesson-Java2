package javanew.Sample;

import java.util.ArrayList;
import java.util.List;

public class ExpansionFor6 {
	public static void main (String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charele");
		//拡張for文を追加
		for ( String name : names ) {
			System.out.println(name);
		}
	}

}
