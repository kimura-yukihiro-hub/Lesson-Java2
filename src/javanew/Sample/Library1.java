package javanew.Sample;

import java.time.LocalDate;

public class Library1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("今日の日付:" + today);
		
		LocalDate nextWeek = today.plusWeeks(1);
		System.out.println("1週間後の日付:" + nextWeek);
	}

}
