package javanew.Sample;

class Student2 {
	String name;
	int[] scores;
	//コンストラクタ
	Student2(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
	}
	//合計点と平均点を計算して表示するメソッド
	void showResult() {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		double average = (double) sum / scores.length;
		System.out.println(name + "さんの結果");
		System.out.println("合計点:" + sum + "点");
		System.out.println("平均点:" + average + "点");
	}
}

public class Students2 {
	public static void main(String[] args) {
		Student2 student1 = new Student2("木村", new int[] {80, 76, 86});
		Student2 student2 = new Student2("田中", new int[] {79, 74, 90});
		
		student1.showResult();
		student2.showResult();
	}

}
