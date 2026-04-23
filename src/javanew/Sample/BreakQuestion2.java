package javanew.Sample;

public class BreakQuestion2 {
	public static void main (String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 7;
		//拡張for文を追加
		for (int num : numbers) {
			System.out.println("現在の値:" + num);
			
			if (num == target) {
				System.out.println(target + "を見つけたのでループを中断します。");
					break;
			}
		}
	}

}
