package javanew.Sample;

import java.util.Scanner;

public class Triangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("3つの整数を入力してください。");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//三角形の成立条件	
		if (a + b >c && a + c >b && b + c >a) {
			System.out.println("これらの長さで三角形は作れます。");
		} else {
			System.out.println("これらの長さで三角形は作れません。");
		}
		sc.close();
	}

}
