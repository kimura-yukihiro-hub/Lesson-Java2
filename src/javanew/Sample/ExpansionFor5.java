package javanew.Sample;

public class ExpansionFor5 {public static void main (String[] args) {
	int[] numbers = {1, 2, 3, 4, 5};
	int sum = 0;
	//拡張forを追加
	for (int num : numbers) {
		sum += num;
	}
	System.out.println("合計:" + sum);
}

}
