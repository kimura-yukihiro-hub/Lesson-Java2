package javanew.Sample;

import java.util.Scanner;

public class Days {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("曜日の番号を1～7で入力してください");
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
		System.out.println("火曜日");
		break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
				default:
					System.out.println("Error: 正しい範囲の数字を入力してください、");
		}
		sc.close();
	}

}
