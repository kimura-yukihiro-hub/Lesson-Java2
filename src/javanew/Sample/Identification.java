package javanew.Sample;

import java.util.ArrayList;
import java.util.List;

public class Identification {
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int target = 4;
		if ( list.contains(target)) {
			System.out.println(target + "はリストに含まれています。");
		}else {
			System.out.println(target + "はリストに含まれていません。");
		}
	}

}
