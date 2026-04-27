package javanew.Sample;

public class OverRoad3 {
	//任意の数の整数の和を計算するメソッド
	public static int sum(int...numbers) {
		int total = 0;
		// 渡された引数は配列（numbers）として扱える
		for (int num : numbers) {
			total += num;
		}
		return total;
	}
	public static void main(String[] args) {
		int result1 = sum(10, 20);
		int result2 = sum(1, 2, 3, 4, 5);
		int result3 = sum();
		
		System.out.println("2つの和: " + result1);
		System.out.println("5つの和: " + result2); 
		System.out.println("引数なしの和: " + result3);
	}

}
