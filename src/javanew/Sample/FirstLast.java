package javanew.Sample;

import java.util.LinkedList;

public class FirstLast {public static void main (String[] args) {
	 LinkedList<String> animals = new LinkedList<>();
	 animals.add("Dog");
	 animals.add("cat");
	 animals.add("Lion");
	 animals.add("Elephant");
	 String first = animals.getFirst();
	 String last  = animals.getLast();
	 System.out.println("リスト全体:" + animals);
	 System.out.println("最初の要素:" + first);
	 System.out.println("最後の要素:" + last);
	
}

}
