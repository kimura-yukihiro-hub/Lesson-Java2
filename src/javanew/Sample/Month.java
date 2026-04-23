package javanew.Sample;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1～12の月の番号を入力してください。");
		int month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("1月");
			break;
		case 2:
			System.out.println("2月");
			break;
		case 3:
			System.out.println("3月");
			break;
		case 4:
			System.out.println("4月");
			break;
		case 5:
			System.out.println("5月");
			break;
		case 6:
			System.out.println("6月");
			break;
		case 7:
			System.out.println("7月");
			break;
		case 8:
			System.out.println("8月");
			break;
		case 9:
			System.out.println("9月");
			break;
		case 10:
			System.out.println("10月");
			break;
		case 11:
			System.out.println("11月");
			break;
		case 12:
			System.out.println("12月");
			break;
		default:
			System.out.println("Error: 正しい範囲の数字を入力してください、");
		}
		sc.close();
	}

}
