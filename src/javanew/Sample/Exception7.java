package javanew.Sample;

import java.util.Scanner;

public class Exception7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		String input = sc.nextLine();
		
		try {
			int num = Integer.parseInt(input);
			
			int resurt = 10 /num;
			System.out.println("計算結果:" + resurt);
		}catch (NumberFormatException e) {
			System.out.println("例外が発生しました:" +e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("例外が発生しました:" + e.getMessage());
		}finally {
			System.out.println("プログラム終了");
		}
	}

}
