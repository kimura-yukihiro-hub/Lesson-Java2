package javanew.Sample;

import java.util.Scanner;

public class WhileQuestion3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input;
		
		System.out.println("整数を入力してください。0を入力するまで、合計を計算します。");
		input = sc.nextInt();
		while (input != 0) {
			sum += input;
			System.out.println("次の数字(または0)");
			input = sc.nextInt();
		}
		System.out.println("これまでの合計は:" + sum);
		sc.close();
	}

}
