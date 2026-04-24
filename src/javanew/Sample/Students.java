package javanew.Sample;

class Student {
	String name;
	int[] scores; //成績を保持する配列

	//平均点を計算して表示するメソッド
	void showAverage() {
		if (scores == null || scores.length == 0) {
			System.out.println(name + "さんの成績データがありません。");
			return; //これより下の計算の処理はされない。
		}
		int sum = 0;
		for (int score : scores) {
			sum += score; //配列の中身を合計する
		}
		double average = (double) sum / scores.length; //合計を科目数で割る
		System.out.println(name + "さんの平均点は" + average + "点です。");
	}
}

public class Students {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "田中太郎";
		student.scores = new int[] { 80, 76, 94, 70 }; //いくつかの教科の点数
		student.showAverage();
	}

}
