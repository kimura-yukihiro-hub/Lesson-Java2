package javanew.Sample;

import java.util.ArrayList;
import java.util.List;

public class Conversion2 {
	public static void main (String[] args) {
		//1. ArrayListを作成して文字列を追加
		List<String> nameList = new ArrayList<>();
		nameList.add("Alice");
		nameList.add("Gon");
		nameList.add("Bob");
		nameList.add("Meary");
		
		//2. ArrayListを配列に変換
		String[] nameArray = nameList.toArray(new String[0]);
		
		System.out.println("配列に変換した後の要素を表示します。");
		
		//3. 配列の要素をすべて表示
		for (String name : nameArray) {
			System.out.println(name);
		}
	}

}
