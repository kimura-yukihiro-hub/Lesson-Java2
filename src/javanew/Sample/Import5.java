package javanew.Sample;

import java.util.ArrayList;
import java.util.Random;

public class Import5 {
	public static void main(String[] args) {
		//Randomクラスを使って乱数を生成する準備
		Random rand = new Random();

		//ArrayListを使って数値のリストを作成
		ArrayList<Integer> numbers = new ArrayList<>();

		//ランダムな数値（0〜99）を3つリストに追加
		for (int i = 0; i < 3; i++) {
			int num = rand.nextInt(100);
			numbers.add(num);
		}
		//結果の表示
		System.out.println("生成されたランダムな数値リスト:" + numbers);
	}

}
