package javanew.Sample;

public class ComandLine {
	public static void main(String[] args) {
		if (args.length > 0 ) {
			//最初の引数を表示
			System.out.println("受け取った値:" + args[0]);
		} else {
			System.out.println("引数がありません。");
		}
	}

}
