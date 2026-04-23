package javanew.Sample;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A, B, C, D, Fのどれかを入力してください");
		String grade = sc.next();

		switch (grade) {
		case "A":
			System.out.println("大変すばらしいです!その調子で頑張りましょう!");
			break;
		case "B":
			System.out.println("良い成績です。さらなる向上を目指しましょう。");
			break;
		case "C":
			System.out.println("合格です。復習をしっかり行いましょう。");
			break;
		case "D":
			System.out.println("ぎりぎり合格です。苦手分野を克服しましょう。");
			break;
		case "F":
			System.out.println("不合格です。再試験や補習が必要です。");
			break;
		default:
			System.out.println("Error: A, B, C, D, F のいずれかを入力してください。");
		}
		sc.close();
	}
}
