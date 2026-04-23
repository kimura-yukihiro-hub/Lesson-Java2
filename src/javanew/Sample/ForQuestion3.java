package javanew.Sample;

public class ForQuestion3 {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		System.out.println("フィボナッチ数列の最初の10項");
		for (int i = 1; i < 11; i++) {
			System.out.println(n1 + "");
			int nextSum = n1 + n2;
			n1 = n2;
			n2 = nextSum;
		}
	}

}
