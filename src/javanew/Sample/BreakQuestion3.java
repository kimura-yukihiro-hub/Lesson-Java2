package javanew.Sample;

public class BreakQuestion3 {
	public static void main (String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int target = 5;
		//outerという名前のラベルを外側のループに付ける
		outer:
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.println("確認中:" + matrix[i][j]);
					
					if (matrix[i][j] == target) {
						System.out.println(target + "を見つけたのですべてのループを終了します。");
						break outer;
					}
				}
			}
	}

}
