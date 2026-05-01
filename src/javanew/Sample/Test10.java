package javanew.Sample;

import java.util.ArrayList;

public class Test10 {
	public static void main(String[] args) {
		ArrayList<String> id = new ArrayList<>();
		id.add("TASK001");
		id.add("TASK002");
		id.add("TASK003");
		id.add("TASK001");
		id.add("TASK004");
		id.add("TASK002");
		String e0 = id.get(0);
		String e1 = id.get(1);
		String e2 = id.get(2);
		String e3 = id.get(3);
		String e4 = id.get(4);
		String e5 = id.get(5);
		System.out.println("処理済みのタスクID一覧:");
		System.out.println("-" + e0);
		System.out.println("-" + e1);
		System.out.println("-" + e2);
		System.out.println("-" + e3);
		System.out.println("-" + e4);
		System.out.println("-" + e5);
		id.add("TASK03");
		id.add("TASK05");
		System.out.println("処理済みのタスクの総数:" + id.size());

	}

}
