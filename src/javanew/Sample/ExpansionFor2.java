package javanew.Sample;

import java.util.ArrayList;
import java.util.List;

public class ExpansionFor2 {
	public static void main (String[] args) {
		List<String>list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Peach");
		list.add("Grape");
		list.add("Orange");
		System.out.println("リストの要素を表示します。:");
		for ( String fruits :list) {
			System.out.println(fruits);
		}
	}

}
