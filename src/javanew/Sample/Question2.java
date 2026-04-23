package javanew.Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question2 {
	public static void main (String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Peach");
		
		//アルファベット順にソート
		Collections.sort(fruits);
		
		System.out.println("ソート後のリスト");
		fruits.forEach(System.out::println);
	}

}
