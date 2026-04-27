package javanew.Sample;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest4 {
	public static void main(String[] args) {
		//問題1
		ArrayList<String> animal = new ArrayList<>();

		animal.add("犬");
		animal.add("猫");
		animal.add("うさぎ");
		animal.add("へび");
		//問題2
		String target = "犬";
		if (animal.contains(target)) {
			System.out.println(target + "はリストに含まれています");
		} else {
			System.out.println(target + "はリストに含まれていません");
		}
		//問題3
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		switch (month) {
		case 1:
			System.out.println("冬物セール");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("春物セール");
			break;
		case 6:
		case 7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
			break;

		}
	}
}
