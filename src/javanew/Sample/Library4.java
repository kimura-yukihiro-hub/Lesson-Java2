package javanew.Sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Library4 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 H時m分");
		
		String formattedDate = now.format(formatter);
		System.out.println(formattedDate);
	}

}
