package javanew.Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student5 {
	String name;
	int score;

	Student5(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + ":" + score + "点";
	}
}

//ScoreComparatorクラスの作成（降順ソート）
class ScoreComparator implements Comparator<Student5> {
	@Override
	public int compare(Student5 s1, Student5 s2) {
		return s2.score - s1.score;
	}
}

public class Interface8 {
	public static void main(String[] args) {
		List<Student5> students = new ArrayList<>();
		students.add(new Student5("田中", 79));
		students.add(new Student5("木村", 89));
		students.add(new Student5("加藤", 90));
		
		// ScoreComparatorを使ってソート
		Collections.sort(students, new ScoreComparator());
		
		// 結果表示
		for (Student5 s : students) {
			System.out.println(s);
		}
	}

}
