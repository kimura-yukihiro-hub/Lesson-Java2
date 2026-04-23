package javanew.Sample;

import java.util.ArrayList;
import java.util.List;

public class CheckNumberList {
	public static void main(String[] args) {
		int a = 20;
		List<String> checklist = new ArrayList<>();
		boolean isLarge = a > 10;
		if (isLarge) {
			checklist.add("large");
		} else {
			checklist.add("small");
		}
		System.out.println(checklist);
	}

}
