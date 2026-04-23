package javanew.Sample;

public class ExpansionFor3 {
	public static void main (String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		System.out.println("配列の要素の合計は:" + total);
	}

}
