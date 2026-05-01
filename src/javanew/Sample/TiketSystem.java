package javanew.Sample;

import java.util.Scanner;

public class TiketSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("年齢を入力してください:");
		int age = sc.nextInt();
		if (age >= 60) {
			System.out.println(age + "歳: 700円");
		} else if (age <= 59 && age >= 18) {
			System.out.println(age +"歳: 1200円");
		} else if (age <= 17 && age >= 13) {
			System.out.println(age + "歳: 800円");
		} else if (age <= 12 && age >= 4) {
			System.out.println(age + "歳: 500円");
		} else if (age <= 3 && age >= 0) {
			System.out.println(age + "歳: 無料");
		} else if (age <= -1 && age <= 120) {
			System.out.println("不正な値が入力されました。");
		}
		sc.close();
	}
}
