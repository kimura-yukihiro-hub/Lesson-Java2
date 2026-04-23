package javanew.Sample;

import java.util.Scanner;

public class CheckAge {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("歳を入力してください。");
		int age = sc.nextInt();
		if (age <= 12) {
			System.out.println(age + "歳は無料です。");
		} else if (age >=13 && age <= 59) {
			System.out.println(age + "歳は入場料が1000円かかります");
		} else  if (age >= 60) {
			System.out.println(age + "歳は入場料が500円かかります。");
		}
		sc.close();
	}

}
