package javanew.Sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Collection2 {
	public static void main (String[] args) {
		//重複を含むArrayListの作成
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(20);
		
		//ArrayListをHashSetに変換
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println("重複削除後の要素");
		set.forEach(System.out::println);
	}

}
