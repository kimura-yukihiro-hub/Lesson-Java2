package javanew.Sample;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("商品の単価を入力してください:");
		int price = sc1.nextInt();
		System.out.println("商品の単価:" + price + "円");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("購入個数を入力してください:");
		int kosuu = sc2.nextInt();
		System.out.println("購入個数:" + kosuu + "個");
		int sum = price * kosuu;
		System.out.println("割引前の合計金額:" + sum + "円");
		if (sum >= 5000 && sum <= 10000 && kosuu >= 5) {
			int waribiki1 = sum * 5 / 100;
			sum = sum - waribiki1 - (kosuu * 100);
			System.out.println("割引額:" + waribiki1 + (kosuu * 100) + "円");
			System.out.println("割引後の価格:" + sum + "円");
			int zeikin = sum * 10 / 100;
			System.out.println("消費税額:" + zeikin + "円");
			sum = sum + zeikin;
			System.out.println("税込価格:" + sum + "円");
		} else if (sum >= 5000 && sum <= 10000 && kosuu >= 3 && kosuu <= 4) {
			int waribiki1 = sum * 5 / 100;
			sum = sum - waribiki1 - (kosuu * 50);
			System.out.println("割引額:" + waribiki1 + (kosuu * 50) + "円");
			System.out.println("割引後の価格:" + sum + "円");
			int zeikin = sum * 10 / 100;
			System.out.println("消費税額:" + zeikin + "円");
			sum = sum + zeikin;
			System.out.println("税込価格:" + sum + "円");
		} else if (sum >= 10000 && kosuu >= 5) {
			int waribiki2 = sum * 10 / 100;
			sum = sum - waribiki2 - (kosuu * 100);
			System.out.println("割引額:" + waribiki2 + (kosuu * 100) + "円");
			System.out.println("割引後の価格:" + sum + "円");
			int zeikin = sum * 10 / 100;
			System.out.println("消費税額:" + zeikin + "円");
			sum = sum + zeikin;
			System.out.println("税込価格:" + sum + "円");
		} else if (sum >= 10000 && kosuu >= 3 && kosuu <= 4) {
			int waribiki2 = sum * 10 / 100;
			sum = sum - waribiki2 - (kosuu * 50);
			System.out.println("割引額:" + waribiki2 + (kosuu * 50) + "円");
			System.out.println("割引後の価格:" + sum + "円");
			int zeikin = sum * 10 / 100;
			System.out.println("消費税額:" + zeikin + "円");
			sum = sum + zeikin;
			System.out.println("税込価格:" + sum + "円");
		} else if (sum < 5000 && sum >= 0 && kosuu >= 5) {
			sum = sum - kosuu * 100;
			System.out.println("割引額:" + (kosuu * 100) + "円");
			System.out.println("割引後の価格:" + sum + "円");
			int zeikin = sum * 10 / 100;
			System.out.println("消費税額:" + zeikin + "円");
			sum = sum + zeikin;
			System.out.println("税込価格:" + sum + "円");
		} else if (sum < 5000 && sum >= 0 && kosuu >= 3 && kosuu <= 4) {
			sum = sum - kosuu * 50;
			System.out.println("割引額:" + (kosuu * 50) + "円");
			System.out.println("割引後の価格:" + sum + "円");
			int zeikin = sum * 10 / 100;
			System.out.println("消費税額:" + zeikin + "円");
			sum = sum + zeikin;
			System.out.println("税込価格:" + sum + "円");
		} else {
			System.out.println("不正な値が入力されました。");
		}
		sc1.close();
		sc2.close();
	}
}
