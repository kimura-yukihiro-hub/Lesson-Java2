package javanew.Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection1 {
	public static void main(String[] args) {
		List<Integer> collectionList = new ArrayList<>();
		collectionList.add(1);
		collectionList.add(2);
		collectionList.add(3);
		collectionList.add(4);
		collectionList.add(5);
		//リストを逆順にする
		Collections.reverse(collectionList);
		System.out.println(collectionList);
	}

}
