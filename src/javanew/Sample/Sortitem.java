package javanew.Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortitem {
	public static void main (String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("strawberry");
		fruits.add("orange");
		fruits.add("grape");
		fruits.add("peach");
		fruits.add("apple");
		System.out.println("ソート前:" + fruits);
		
		//アルファベット順にソート
		Collections.sort(fruits);
		
		System.out.println("ソート後:" +fruits);
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
