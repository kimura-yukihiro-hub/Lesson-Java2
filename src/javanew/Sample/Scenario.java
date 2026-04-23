package javanew.Sample;

public class Scenario {
	public static void main (String[] args) {
		String[] names = {"田中", "佐藤", "鈴木", "木村", "伊藤"};
		int[] grades = {87, 65, 94, 57, 86};
		int sum = 0;
			System.out.println("--学生成績表--");
			for ( int i = 0; i < names.length; i++) {
				System.out.println(names[i] + ":" + grades[i] + "点");
				sum += grades[i];
			}
			double average = (double) sum / grades.length;
			System.out.println("-----------------");
			System.out.println("合計点" + sum + "点");
			System.out.println("平均点" + average + "点");
	}

}
//配列とリスト問3(1)
//A. 配列を使う　(理由) 条件で、「学生の数が固定されており、追加や削除などは行わない」というものがあり、
//   後から変更できるリストの柔軟性は必要ないから。