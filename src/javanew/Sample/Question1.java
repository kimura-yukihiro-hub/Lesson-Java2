package javanew.Sample;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public static void main (String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(25);
		numbers.add(40);
		//確認したい値
		int target = 25;
		if (numbers.contains(target)) {
			System.out.println(target + "はリストに含まれています。");
		} else {
			System.out.println(target + "はリストに含まれていません。");
		}
	}

}
