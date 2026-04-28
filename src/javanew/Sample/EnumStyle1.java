package javanew.Sample;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumStyle1 {
	public static void main(String[] args) {
		Day today = Day.TUESDAY;

		System.out.println("今日の曜日:" + today);

		if (today == Day.SATURDAY || today == Day.SUNDAY) {
			System.out.println("お休みです!");
		} else {
			System.out.println("仕事や学校を頑張りましょう!");
		}
	}

}
