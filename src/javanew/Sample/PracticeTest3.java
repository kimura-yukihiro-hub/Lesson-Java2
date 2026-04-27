package javanew.Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[] args) {
		//問題1
		String[] products = { "シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム" };
		//問題2
		System.out.println(products[1]);
		//問題3
		List<String> employees = new ArrayList<>();
		employees.add("山田太郎");
		employees.add("鈴木花子");
		employees.add("佐藤二郎");
		employees.add("山田太郎");
		employees.add("高橋三郎");
		//問題5
		System.out.println(employees.get(2));
		//問題6
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);

		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(18);
		list1.add(20);

		list1.addAll(list2);

		Collections.sort(list1);

		for (Integer num : list1) {
			System.out.println(num);
		}
		//問題7

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);

		int i = 0;
		int j = 0;

		while (i < list1.size() && j < list3.size()) {
			if (list1.get(i) <= list3.get(j)) {
				System.out.println(list1.get(i));
				i++;
			} else {
				System.out.println(list3.get(j));
				j++;
			}
		}
		while (i < list1.size()) {
			System.out.println(list1.get(i));
			i++;
		}
		while (j < list3.size()) {
			System.out.println(list3.get(j));
			j++;
		}

	}
}
