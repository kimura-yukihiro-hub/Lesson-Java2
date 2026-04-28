package javanew.Sample;

import java.util.ArrayList;
public class Import2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Java");
		names.add("Python");
		names.add("JavaScript");
		
		for (String name : names) {
			System.out.println("プログラミング言語:" + name);
		}
	}

}
