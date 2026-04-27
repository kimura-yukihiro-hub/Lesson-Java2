package javanew.Sample;

import java.util.ArrayList;

public class SmallTest {
	public static void main(String[] args) {
		//問題3
		// 外側のループ（1段目から9段目まで）
		for (int i = 1; i <= 9; i++) {
			// 内側のループ（かけられる数 1から9まで）
			for (int j = 1; j <= 9; j++) {
				// 計算結果を表示（タブ "\t" を使って間隔を揃える）
				System.out.print(i * j + "\t");
			}
			// 1つの段が終わったら改行する
			System.out.println();
		}
		//問題4
		int num = 10;

		// 外側のループ（1段目から9段目まで）
		for (int i = num; i < num + 10; i++) {
			// 内側のループ（かけられる数 1から9まで）
			for (int j = num; j < num + 10; j++) {
				// 計算結果を表示（タブ "\t" を使って間隔を揃える）
				System.out.print(i * j + "\t");
			}
			// 1つの段が終わったら改行する
			System.out.println();
		}
		//問題5
		//社員リスト
		ArrayList<String> employees = new ArrayList<>();
		employees.add("斎藤");
		employees.add("田中");
		employees.add("山田");
		employees.add("鈴木");
		employees.add("高橋");
		
		//提出者リスト
		ArrayList<String> submitters = new ArrayList<>();
		submitters.add("斎藤");
        submitters.add("高橋");
        //提出者を取り除く
        employees.removeAll(submitters);
        //未提出者をコンソール
        System.out.println("未提出者: " + employees);
        //問題6
        for (int x = 2; x <= 100; x++) {
        	boolean isPrime = true; //素数かどうかのフラグ
        	//xが自分より小さい数で割り切れるかチェック
        	for (int y = 2; y < x; y++) {
        		if (x % y == 0) {
        			isPrime = false; // 割り切れたら素数じゃない
        			break;
        		}
        	}
        	// チェックの結果、一度も割り切れなかったら出力
        	if (isPrime) {
        		System.out.println(x + " ");
        	}
        }

	}
	}
	




