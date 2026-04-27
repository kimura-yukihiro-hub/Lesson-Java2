package javanew.Sample;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String[] args) {
		//問題1
		Random rand = new Random();
		int fortune = rand.nextInt(3) + 1;
		System.out.println("運勢番号: " + fortune);
		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		//問題2
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				if (result.length() > 0) {
					result.append(",");
				}
				result.append(i);
			}
		}
		System.out.println(result.toString());
	}

}
