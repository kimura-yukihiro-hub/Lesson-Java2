package javanew.Sample;

import java.util.Scanner;

public class PositiveNegative {
	public static void main (String[] main) {
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力してください。");
		int num =sc.nextInt();
		if (num >0) {
			System.out.println(num + "は正の数です。");
		} else if (num < 0) {
			System.out.println(num + "は負の数です");
		} else {
			System.out.println("入力されたのは0です。");
		}
	}

}
