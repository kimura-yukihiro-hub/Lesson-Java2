package javanew.Sample;

import java.util.Scanner;

public class DoWhileQuestion3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input;
		System.out.println("整数を入力してください。(0が入力されると、合計を表示して終了します。)");
		do {
			System.out.println("次の数字(または0)");
			input = sc.nextInt();
			sum += input;
		} while (input != 0);
		System.out.println("最終的な合計は、" + sum +"です。");
		sc.close();
	}

}
