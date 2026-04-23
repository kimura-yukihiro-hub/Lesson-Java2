package javanew.Sample;

import java.util.Scanner;

public class EvebOrOddNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("整数を入力してください。");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
		sc.close();
	}

}
