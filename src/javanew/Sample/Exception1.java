package javanew.Sample;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("整数を入力してください。");
		String input = s.nextLine();
		
		try {	
		// 入力された文字列を整数に変換
			int number = Integer.parseInt(input);
			
			// 2で割った値を表示
			int result = number / 2;
			System.out.println("2で割った結果:" + result);
		}catch (NumberFormatException e) {
			 // 整数でない（あいうえお、等）が入力された場合の処理
			System.out.println("エラー:整数を入力してください。");
		}finally {
			s.close();
		}
	}

}
