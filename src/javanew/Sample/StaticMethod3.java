package javanew.Sample;

class ArrayUtils {
	static int max(int[] numbers) {
		// 配列の最初の要素を暫定の最大値とする
		int maxVal = numbers[0];
		
		// 配列の中身を順番にチェック
		for (int i = 1; i < numbers.length; i++) {
			// 今の最大値より大きい数字を見つけたら、maxValを書き換える
			if (numbers[i] > maxVal) {
				maxVal = numbers[i];
			}
		}
		return maxVal;
	}
}

public class StaticMethod3 {
	public static void main(String[] args) {
		int[] data = {1, 3, 68, 97, 45, 2};
		int result = ArrayUtils.max(data);
		
		System.out.println("配列の最大値は: " + result);

	}

}
