package javanew.Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion1 {
	public static void main (String[] args) {
		
		//1. 整数の配列を作成
		int[] numberArray = {10, 20, 30, 40, 50};
		//2. 配列をArrayListに変換
		List<Integer> numberList = Arrays.stream(numberArray).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println("ArrayListの要素を表示します。");
		
		//3. 拡張for文を使って表示
		for (int num : numberList) {
			System.out.println(num);
		}
	}

}
