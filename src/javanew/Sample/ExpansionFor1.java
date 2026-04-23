package javanew.Sample;

public class ExpansionFor1 {
	public static void main (String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		System.out.println("配列の要素を表示します。:");
		//拡張for文
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
